package cyen.data.number.type;

import cyen.data.number.INumberData;
import cyen.data.number.INumberType;
import cyen.data.number.data.DataDouble;
import cyen.data.number.data.DataInt;
import cyen.data.number.data.DataShort;
import cyen.util.NumberUtils;

public class TypeShort implements INumberType {
    @Override
    public INumberData add( INumberData self, INumberData other ) {
        return new DataShort( self.shortValue() + other.shortValue() );
    }

    @Override
    public INumberData sub( INumberData self, INumberData other ) {
        return new DataShort( self.shortValue() - other.shortValue() );
    }

    @Override
    public INumberData mul( INumberData self, INumberData other ) {
        return new DataShort( self.shortValue() * other.shortValue() );
    }

    @Override
    public INumberData div( INumberData self, INumberData other ) {
        short s = self.shortValue(), o = other.shortValue();
        if( s / o * o != s ) return new DataDouble( self.doubleValue() / other.doubleValue() );
        return new DataShort( s / o );
    }

    @Override
    public INumberData floorDiv( INumberData self, INumberData other ) {
        return new DataShort( self.shortValue() / other.shortValue() );
    }

    @Override
    public INumberData mod( INumberData self, INumberData other ) {
        return new DataShort( self.shortValue() % other.shortValue() );
    }

    @Override
    public INumberData pow( INumberData self, INumberData other ) {
        return new DataShort( (int) Math.pow( self.shortValue(), other.shortValue() ) );
    }

    @Override
    public INumberData neg( INumberData self ) {
        return new DataShort( - self.shortValue() );
    }

    @Override
    public INumberData abs( INumberData self ) {
        return new DataShort( Math.abs( self.shortValue() ) );
    }

    @Override
    public INumberData imag( INumberData self ) {
        return new DataShort();
    }

    @Override
    public INumberData real( INumberData self ) {
        return new DataShort( self );
    }

    @Override
    public INumberData floor( INumberData self ) {
        return new DataShort( self.shortValue() );
    }

    @Override
    public INumberData ceil( INumberData self ) {
        return new DataShort( self.shortValue() );
    }

    @Override
    public INumberData round( INumberData self ) {
        return new DataShort( self.shortValue() );
    }

    @Override
    public INumberData leftShift( INumberData self, int amount ) {
        return new DataShort( self.shortValue() << amount );
    }

    @Override
    public INumberData rightShiftSigned( INumberData self, int amount ) {
        return new DataShort( self.shortValue() >> amount );
    }

    @Override
    public INumberData rightShiftUnsigned( INumberData self, int amount ) {
        return new DataShort( self.shortValue() >>> amount );
    }

    @Override
    public INumberData leftRotate( INumberData self, int amount ) {
        return new DataInt( NumberUtils.rotateLeft( self.shortValue(), amount ) );
    }

    @Override
    public INumberData rightRotate( INumberData self, int amount ) {
        return new DataInt( NumberUtils.rotateRight( self.shortValue(), amount ) );
    }

    @Override
    public INumberData bitNot( INumberData self ) {
        return new DataShort( ~ self.shortValue() );
    }

    @Override
    public INumberData bitFlip( INumberData self ) {
        return new DataShort( NumberUtils.reverseBits( self.shortValue() ) );
    }

    @Override
    public INumberData bitCount( INumberData self ) {
        return new DataShort( Integer.bitCount( self.shortValue() & 0xffff ) );
    }

    @Override
    public INumberData binarySwap( INumberData self ) {
        return self;
    }

    @Override
    public INumberData bitOr( INumberData self, INumberData other ) {
        return new DataShort( self.shortValue() | other.shortValue() );
    }

    @Override
    public INumberData bitAnd( INumberData self, INumberData other ) {
        return new DataShort( self.shortValue() & other.shortValue() );
    }

    @Override
    public INumberData bitXor( INumberData self, INumberData other ) {
        return new DataShort( self.shortValue() ^ other.shortValue() );
    }

    @Override
    public INumberData inst( byte n ) {
        return new DataShort( n );
    }

    @Override
    public INumberData inst( short n ) {
        return new DataShort( n );
    }

    @Override
    public INumberData inst( int n ) {
        return new DataShort( (short) n );
    }

    @Override
    public INumberData inst( long n ) {
        return new DataShort( (short) n );
    }

    @Override
    public INumberData inst( float n ) {
        return new DataShort( (short) n );
    }

    @Override
    public INumberData inst( double n ) {
        return new DataShort( (short) n );
    }

    @Override
    public boolean isFloatingPoint() {
        return false;
    }

    @Override
    public int getLevel() {
        return 1;
    }

    @Override
    public String type() {
        return "short";
    }
}
