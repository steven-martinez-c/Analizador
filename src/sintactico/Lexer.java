/* The following code was generated by JFlex 1.4.3 on 16/08/22 0:03 */

package sintactico;
import lexico.*;
import static lexico.Tokens.*;

/**
 * This class is a scanner generated by 
 * <a href="http://www.jflex.de/">JFlex</a> 1.4.3
 * on 16/08/22 0:03 from the specification file
 * <tt>/home/thend/Documentos/Analizador/src/lexico/Lexer.flex</tt>
 */
class Lexer {

  /** This character denotes the end of file */
  public static final int YYEOF = -1;

  /** initial size of the lookahead buffer */
  private static final int ZZ_BUFFERSIZE = 16384;

  /** lexical states */
  public static final int YYINITIAL = 0;

  /**
   * ZZ_LEXSTATE[l] is the state in the DFA for the lexical state l
   * ZZ_LEXSTATE[l+1] is the state in the DFA for the lexical state l
   *                  at the beginning of a line
   * l is of the form l = 2*k, k a non negative integer
   */
  private static final int ZZ_LEXSTATE[] = { 
     0, 0
  };

  /** 
   * Translates characters to character classes
   */
  private static final String ZZ_CMAP_PACKED = 
    "\11\0\1\3\1\25\1\0\2\3\22\0\1\3\1\4\1\65\1\66"+
    "\3\4\1\67\1\16\1\17\1\14\1\7\1\5\1\10\1\23\1\15"+
    "\12\2\1\22\1\6\1\13\1\12\1\11\1\4\1\0\4\1\1\30"+
    "\1\32\10\1\1\31\3\1\1\64\7\1\1\20\1\0\1\21\1\0"+
    "\1\1\1\0\1\33\1\34\1\40\1\51\1\41\1\52\1\56\1\46"+
    "\1\47\1\1\1\61\1\43\1\55\1\44\1\42\1\54\1\62\1\37"+
    "\1\35\1\36\1\50\1\57\1\60\1\53\1\45\1\63\1\26\1\0"+
    "\1\27\43\0\1\4\37\0\1\24\7\0\1\24\3\0\1\24\3\0"+
    "\1\24\1\0\1\24\6\0\1\24\6\0\1\24\7\0\1\24\3\0"+
    "\1\24\3\0\1\24\1\0\1\24\6\0\1\24\uff05\0";

  /** 
   * Translates characters to character classes
   */
  private static final char [] ZZ_CMAP = zzUnpackCMap(ZZ_CMAP_PACKED);

  /** 
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\1\1\1\2\1\3\1\4\1\5\1\2\1\6\1\7"+
    "\1\10\1\11\1\12\1\13\1\14\1\15\1\16\1\17"+
    "\1\20\1\21\1\22\1\23\1\24\1\25\22\3\1\25"+
    "\2\2\1\3\1\26\1\0\1\26\1\4\1\0\1\1"+
    "\1\27\1\30\1\31\1\32\1\33\1\0\1\5\1\0"+
    "\1\25\1\1\27\3\1\34\2\3\1\34\14\3\2\35"+
    "\1\0\1\3\2\0\2\1\1\36\4\0\1\1\27\3"+
    "\1\34\17\3\2\1\1\36\2\1\1\0\1\4\27\3"+
    "\1\1\1\36\1\0\1\1\1\0\5\3\1\34\11\3"+
    "\1\34\2\3\1\0\1\1\1\0\12\3\1\0\1\37"+
    "\6\3\1\0\2\3\1\0\1\3";

  private static int [] zzUnpackAction() {
    int [] result = new int[231];
    int offset = 0;
    offset = zzUnpackAction(ZZ_ACTION_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAction(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /** 
   * Translates a state to a row index in the transition table
   */
  private static final int [] ZZ_ROWMAP = zzUnpackRowMap();

  private static final String ZZ_ROWMAP_PACKED_0 =
    "\0\0\0\70\0\160\0\250\0\70\0\340\0\70\0\70"+
    "\0\u0118\0\u0150\0\u0188\0\70\0\u01c0\0\70\0\u01f8\0\u0230"+
    "\0\70\0\70\0\70\0\70\0\u0268\0\u02a0\0\u02d8\0\u0310"+
    "\0\u0348\0\u0380\0\u03b8\0\u03f0\0\u0428\0\u0460\0\u0498\0\u04d0"+
    "\0\u0508\0\u0540\0\u0578\0\u05b0\0\u05e8\0\u0620\0\u0658\0\u0690"+
    "\0\u06c8\0\u0700\0\u0738\0\u0770\0\340\0\u07a8\0\u07e0\0\u0818"+
    "\0\u0850\0\u0888\0\70\0\70\0\70\0\70\0\70\0\u08c0"+
    "\0\u08f8\0\u0930\0\u0968\0\u09a0\0\u09d8\0\u0a10\0\u0a48\0\u0a80"+
    "\0\u0ab8\0\u0af0\0\u0b28\0\u0b60\0\u0b98\0\u0bd0\0\u0c08\0\u0c40"+
    "\0\u0c78\0\u0cb0\0\u0ce8\0\u0d20\0\u0d58\0\u0d90\0\u0dc8\0\u0e00"+
    "\0\u0e38\0\u0e70\0\u0ea8\0\160\0\u0ee0\0\u0f18\0\u0f50\0\u0f88"+
    "\0\u0fc0\0\u0ff8\0\u1030\0\u1068\0\u10a0\0\u10d8\0\u1110\0\u1148"+
    "\0\u1180\0\u11b8\0\u11f0\0\70\0\u0700\0\u1228\0\u1260\0\u1298"+
    "\0\u12d0\0\u0850\0\u1308\0\u1340\0\u1378\0\u13b0\0\u13e8\0\u1420"+
    "\0\u1458\0\u1490\0\u14c8\0\u1500\0\u1538\0\u1570\0\u15a8\0\u15e0"+
    "\0\u1618\0\u1650\0\u1688\0\u16c0\0\u16f8\0\u1730\0\u1768\0\u17a0"+
    "\0\u17d8\0\u1810\0\u1848\0\u1880\0\u18b8\0\u18f0\0\u1928\0\u1960"+
    "\0\u1998\0\u19d0\0\u1a08\0\u1a40\0\u1a78\0\u1ab0\0\u1ae8\0\u1b20"+
    "\0\u1b58\0\u1b90\0\u1bc8\0\u1c00\0\u1c38\0\u1c70\0\u1ca8\0\u1ce0"+
    "\0\70\0\u1d18\0\u1d50\0\u1d88\0\u1dc0\0\u1df8\0\70\0\u1e30"+
    "\0\u1e68\0\u1ea0\0\u1ed8\0\u1f10\0\u1f48\0\u1f80\0\u1fb8\0\u1ff0"+
    "\0\u2028\0\u2060\0\u2098\0\u20d0\0\u2108\0\u2140\0\u2178\0\u21b0"+
    "\0\u21e8\0\u2220\0\u2258\0\u2290\0\u22c8\0\u2300\0\u2338\0\u2370"+
    "\0\u2370\0\u23a8\0\u23e0\0\u2418\0\u2450\0\u2488\0\u24c0\0\u24f8"+
    "\0\u16f8\0\u2530\0\u2568\0\u25a0\0\u25d8\0\u2610\0\u2648\0\u2680"+
    "\0\u26b8\0\u26f0\0\u2728\0\u2760\0\u2798\0\u27d0\0\u2808\0\u2840"+
    "\0\u2878\0\u28b0\0\u28e8\0\u2920\0\u2958\0\u2990\0\u29c8\0\u2a00"+
    "\0\u2a38\0\u2a70\0\u2aa8\0\70\0\u2ae0\0\u2b18\0\u2b50\0\u2b88"+
    "\0\u2bc0\0\u2bf8\0\u2c30\0\u2c68\0\u2ca0\0\u2cd8\0\u2d10";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[231];
    int offset = 0;
    offset = zzUnpackRowMap(ZZ_ROWMAP_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackRowMap(String packed, int offset, int [] result) {
    int i = 0;  /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int high = packed.charAt(i++) << 16;
      result[j++] = high | packed.charAt(i++);
    }
    return j;
  }

  /** 
   * The transition table of the DFA
   */
  private static final int [] ZZ_TRANS = zzUnpackTrans();

  private static final String ZZ_TRANS_PACKED_0 =
    "\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11"+
    "\1\12\1\13\1\14\1\15\1\16\1\17\1\20\1\21"+
    "\1\22\1\23\1\24\1\25\1\6\1\5\1\26\1\2"+
    "\3\3\1\27\1\30\1\31\1\32\1\33\1\34\1\35"+
    "\1\3\1\36\1\37\2\3\1\40\1\3\1\41\1\42"+
    "\1\3\1\43\1\44\1\45\1\46\1\47\3\3\1\50"+
    "\1\51\1\52\1\53\71\0\1\3\1\54\1\0\1\55"+
    "\16\0\1\56\1\55\3\0\35\3\1\0\1\55\2\0"+
    "\1\57\1\60\2\0\1\61\15\0\1\62\1\55\3\0"+
    "\35\57\4\0\2\55\1\0\1\55\17\0\1\55\3\0"+
    "\35\55\1\0\1\55\10\0\1\63\70\0\1\64\71\0"+
    "\1\65\66\0\1\66\1\67\1\70\71\0\1\71\62\0"+
    "\1\72\3\0\1\73\55\0\1\74\65\0\27\26\1\5"+
    "\40\26\1\0\1\3\1\54\1\0\1\55\16\0\1\56"+
    "\1\55\3\0\4\3\1\75\1\76\27\3\1\0\1\55"+
    "\2\0\1\3\1\54\1\0\1\55\16\0\1\56\1\55"+
    "\3\0\12\3\1\77\2\3\1\100\17\3\1\0\1\55"+
    "\2\0\1\3\1\54\1\0\1\55\16\0\1\56\1\55"+
    "\3\0\6\3\1\101\6\3\1\102\1\103\1\3\1\104"+
    "\7\3\1\105\4\3\1\0\1\55\2\0\1\3\1\54"+
    "\1\0\1\55\16\0\1\56\1\55\3\0\7\3\1\106"+
    "\6\3\1\107\16\3\1\0\1\55\2\0\1\3\1\54"+
    "\1\0\1\55\16\0\1\56\1\55\3\0\11\3\1\110"+
    "\23\3\1\0\1\55\2\0\1\3\1\54\1\0\1\55"+
    "\16\0\1\56\1\55\3\0\3\3\1\111\6\3\1\112"+
    "\1\113\2\3\1\114\16\3\1\0\1\55\2\0\1\3"+
    "\1\54\1\0\1\55\16\0\1\56\1\55\3\0\13\3"+
    "\1\115\7\3\1\116\11\3\1\0\1\55\2\0\1\3"+
    "\1\54\1\0\1\55\16\0\1\56\1\55\3\0\12\3"+
    "\1\117\22\3\1\0\1\55\2\0\1\3\1\54\1\0"+
    "\1\55\16\0\1\56\1\55\3\0\3\3\1\120\5\3"+
    "\1\121\6\3\1\122\14\3\1\0\1\55\2\0\1\3"+
    "\1\54\1\0\1\55\16\0\1\56\1\55\3\0\14\3"+
    "\1\123\5\3\1\124\2\3\1\125\7\3\1\0\1\55"+
    "\2\0\1\3\1\54\1\0\1\55\16\0\1\56\1\55"+
    "\3\0\11\3\1\126\1\127\22\3\1\0\1\55\2\0"+
    "\1\3\1\54\1\0\1\55\16\0\1\56\1\55\3\0"+
    "\3\3\1\130\6\3\1\131\1\132\3\3\1\133\15\3"+
    "\1\0\1\55\2\0\1\3\1\54\1\0\1\55\16\0"+
    "\1\56\1\55\3\0\3\3\1\134\3\3\1\135\10\3"+
    "\1\136\14\3\1\0\1\55\2\0\1\3\1\54\1\0"+
    "\1\55\16\0\1\56\1\55\3\0\12\3\1\137\22\3"+
    "\1\0\1\55\2\0\1\3\1\54\1\0\1\55\16\0"+
    "\1\56\1\55\3\0\12\3\1\140\22\3\1\0\1\55"+
    "\2\0\1\3\1\54\1\0\1\55\16\0\1\56\1\55"+
    "\3\0\3\3\1\131\6\3\1\141\22\3\1\0\1\55"+
    "\2\0\1\3\1\54\1\0\1\55\16\0\1\56\1\55"+
    "\3\0\16\3\1\142\16\3\1\0\1\55\2\0\1\3"+
    "\1\54\1\0\1\55\16\0\1\56\1\55\3\0\6\3"+
    "\1\143\26\3\1\0\1\55\1\0\65\51\1\144\2\51"+
    "\1\0\1\55\1\145\1\0\1\55\17\0\1\55\3\0"+
    "\35\55\1\0\1\55\1\0\67\146\2\0\1\147\1\54"+
    "\1\0\1\55\16\0\1\61\1\55\3\0\35\147\1\0"+
    "\1\55\2\0\1\150\1\151\25\0\35\150\4\0\1\57"+
    "\1\55\1\0\1\55\16\0\1\152\1\55\3\0\35\57"+
    "\1\0\1\55\2\0\1\57\1\60\2\0\1\61\15\0"+
    "\1\153\1\55\3\0\35\57\5\0\1\152\66\0\1\150"+
    "\1\154\25\0\35\150\33\0\1\155\37\0\25\71\1\0"+
    "\42\71\2\0\1\156\65\0\14\73\1\157\2\73\1\160"+
    "\50\73\2\0\1\74\25\0\1\161\10\0\1\161\27\0"+
    "\1\3\1\54\1\0\1\55\16\0\1\56\1\55\3\0"+
    "\5\3\1\162\27\3\1\0\1\55\2\0\1\3\1\54"+
    "\1\0\1\55\16\0\1\56\1\55\3\0\5\3\1\163"+
    "\27\3\1\0\1\55\2\0\1\3\1\54\1\0\1\55"+
    "\16\0\1\56\1\55\3\0\12\3\1\164\22\3\1\0"+
    "\1\55\2\0\1\3\1\54\1\0\1\55\16\0\1\56"+
    "\1\55\3\0\6\3\1\165\26\3\1\0\1\55\2\0"+
    "\1\3\1\54\1\0\1\55\16\0\1\56\1\55\3\0"+
    "\3\3\1\166\31\3\1\0\1\55\2\0\1\3\1\54"+
    "\1\0\1\55\16\0\1\56\1\55\3\0\14\3\1\167"+
    "\20\3\1\0\1\55\2\0\1\3\1\54\1\0\1\55"+
    "\16\0\1\56\1\55\3\0\12\3\1\170\22\3\1\0"+
    "\1\55\2\0\1\3\1\54\1\0\1\55\16\0\1\56"+
    "\1\55\3\0\24\3\1\171\10\3\1\0\1\55\2\0"+
    "\1\3\1\54\1\0\1\55\16\0\1\56\1\55\3\0"+
    "\17\3\1\172\15\3\1\0\1\55\2\0\1\3\1\54"+
    "\1\0\1\55\16\0\1\56\1\55\3\0\3\3\1\173"+
    "\11\3\1\124\2\3\1\165\14\3\1\0\1\55\2\0"+
    "\1\3\1\54\1\0\1\55\16\0\1\56\1\55\3\0"+
    "\7\3\1\174\7\3\1\175\15\3\1\0\1\55\2\0"+
    "\1\3\1\54\1\0\1\55\16\0\1\56\1\55\3\0"+
    "\6\3\1\176\23\3\1\177\2\3\1\0\1\55\2\0"+
    "\1\3\1\54\1\0\1\55\16\0\1\56\1\55\3\0"+
    "\5\3\1\165\1\200\26\3\1\0\1\55\2\0\1\3"+
    "\1\54\1\0\1\55\16\0\1\56\1\55\3\0\14\3"+
    "\1\201\20\3\1\0\1\55\2\0\1\3\1\54\1\0"+
    "\1\55\16\0\1\56\1\55\3\0\3\3\1\202\31\3"+
    "\1\0\1\55\2\0\1\3\1\54\1\0\1\55\16\0"+
    "\1\56\1\55\3\0\3\3\1\131\31\3\1\0\1\55"+
    "\2\0\1\3\1\54\1\0\1\55\16\0\1\56\1\55"+
    "\3\0\5\3\1\165\27\3\1\0\1\55\2\0\1\3"+
    "\1\54\1\0\1\55\16\0\1\56\1\55\3\0\6\3"+
    "\1\203\15\3\1\204\10\3\1\0\1\55\2\0\1\3"+
    "\1\54\1\0\1\55\16\0\1\56\1\55\3\0\14\3"+
    "\1\205\20\3\1\0\1\55\2\0\1\3\1\54\1\0"+
    "\1\55\16\0\1\56\1\55\3\0\6\3\1\206\26\3"+
    "\1\0\1\55\2\0\1\3\1\54\1\0\1\55\16\0"+
    "\1\56\1\55\3\0\30\3\1\124\4\3\1\0\1\55"+
    "\2\0\1\3\1\54\1\0\1\55\16\0\1\56\1\55"+
    "\3\0\13\3\1\207\21\3\1\0\1\55\2\0\1\3"+
    "\1\54\1\0\1\55\16\0\1\56\1\55\3\0\5\3"+
    "\1\210\1\211\26\3\1\0\1\55\2\0\1\3\1\54"+
    "\1\0\1\55\16\0\1\56\1\55\3\0\24\3\1\212"+
    "\10\3\1\0\1\55\2\0\1\3\1\54\1\0\1\55"+
    "\16\0\1\56\1\55\3\0\22\3\1\213\12\3\1\0"+
    "\1\55\2\0\1\3\1\54\1\0\1\55\16\0\1\56"+
    "\1\55\3\0\20\3\1\214\14\3\1\0\1\55\2\0"+
    "\1\3\1\54\1\0\1\55\16\0\1\56\1\55\3\0"+
    "\13\3\1\115\21\3\1\0\1\55\2\0\1\3\1\54"+
    "\1\0\1\55\16\0\1\56\1\55\3\0\7\3\1\124"+
    "\25\3\1\0\1\55\2\0\1\3\1\54\1\0\1\55"+
    "\16\0\1\56\1\55\3\0\12\3\1\215\22\3\1\0"+
    "\1\55\2\0\1\3\1\54\1\0\1\55\16\0\1\56"+
    "\1\55\3\0\14\3\1\216\20\3\1\0\1\55\2\0"+
    "\1\3\1\54\1\0\1\55\16\0\1\56\1\55\3\0"+
    "\10\3\1\217\24\3\1\0\1\55\2\0\1\3\1\54"+
    "\1\0\1\55\16\0\1\56\1\55\3\0\12\3\1\220"+
    "\4\3\1\221\15\3\1\0\1\55\2\0\1\3\1\54"+
    "\1\0\1\55\16\0\1\56\1\55\3\0\4\3\1\222"+
    "\30\3\1\0\1\55\2\0\1\3\1\54\1\0\1\55"+
    "\16\0\1\56\1\55\3\0\21\3\1\223\13\3\1\0"+
    "\1\55\2\0\1\3\1\54\1\0\1\55\16\0\1\56"+
    "\1\55\3\0\6\3\1\224\26\3\1\0\1\55\2\0"+
    "\1\3\1\54\1\0\1\55\16\0\1\56\1\55\3\0"+
    "\13\3\1\225\3\3\1\226\15\3\1\0\1\55\2\0"+
    "\1\3\1\54\1\0\1\55\16\0\1\56\1\55\3\0"+
    "\17\3\1\227\15\3\1\0\1\55\2\0\1\3\1\54"+
    "\1\0\1\55\16\0\1\56\1\55\3\0\7\3\1\230"+
    "\25\3\1\0\1\55\1\0\67\146\1\231\1\0\2\147"+
    "\1\0\1\55\17\0\1\55\3\0\35\147\1\0\1\55"+
    "\2\0\1\150\1\152\25\0\35\150\4\0\1\232\1\151"+
    "\25\0\35\232\4\0\1\150\1\233\25\0\35\150\4\0"+
    "\1\232\1\154\20\0\1\234\4\0\1\235\10\232\1\235"+
    "\23\232\34\0\1\236\40\0\1\156\14\0\1\237\50\0"+
    "\14\160\1\157\2\160\1\5\64\160\1\157\53\160\2\0"+
    "\1\152\5\0\1\152\60\0\1\3\1\54\1\0\1\55"+
    "\16\0\1\56\1\55\3\0\6\3\1\240\26\3\1\0"+
    "\1\55\2\0\1\3\1\54\1\0\1\55\16\0\1\56"+
    "\1\55\3\0\11\3\1\170\23\3\1\0\1\55\2\0"+
    "\1\3\1\54\1\0\1\55\16\0\1\56\1\55\3\0"+
    "\13\3\1\241\21\3\1\0\1\55\2\0\1\3\1\54"+
    "\1\0\1\55\16\0\1\56\1\55\3\0\11\3\1\124"+
    "\23\3\1\0\1\55\2\0\1\3\1\54\1\0\1\55"+
    "\16\0\1\56\1\55\3\0\6\3\1\242\26\3\1\0"+
    "\1\55\2\0\1\3\1\54\1\0\1\55\16\0\1\56"+
    "\1\55\3\0\10\3\1\243\24\3\1\0\1\55\2\0"+
    "\1\3\1\54\1\0\1\55\16\0\1\56\1\55\3\0"+
    "\7\3\1\244\25\3\1\0\1\55\2\0\1\3\1\54"+
    "\1\0\1\55\16\0\1\56\1\55\3\0\11\3\1\131"+
    "\23\3\1\0\1\55\2\0\1\3\1\54\1\0\1\55"+
    "\16\0\1\56\1\55\3\0\6\3\1\200\26\3\1\0"+
    "\1\55\2\0\1\3\1\54\1\0\1\55\16\0\1\56"+
    "\1\55\3\0\14\3\1\245\20\3\1\0\1\55\2\0"+
    "\1\3\1\54\1\0\1\55\16\0\1\56\1\55\3\0"+
    "\12\3\1\246\22\3\1\0\1\55\2\0\1\3\1\54"+
    "\1\0\1\55\16\0\1\56\1\55\3\0\5\3\1\124"+
    "\27\3\1\0\1\55\2\0\1\3\1\54\1\0\1\55"+
    "\16\0\1\56\1\55\3\0\20\3\1\247\14\3\1\0"+
    "\1\55\2\0\1\3\1\54\1\0\1\55\16\0\1\56"+
    "\1\55\3\0\20\3\1\250\14\3\1\0\1\55\2\0"+
    "\1\3\1\54\1\0\1\55\16\0\1\56\1\55\3\0"+
    "\10\3\1\251\24\3\1\0\1\55\2\0\1\3\1\54"+
    "\1\0\1\55\16\0\1\56\1\55\3\0\5\3\1\244"+
    "\1\252\26\3\1\0\1\55\2\0\1\3\1\54\1\0"+
    "\1\55\16\0\1\56\1\55\3\0\5\3\1\175\27\3"+
    "\1\0\1\55\2\0\1\3\1\54\1\0\1\55\16\0"+
    "\1\56\1\55\3\0\11\3\1\253\23\3\1\0\1\55"+
    "\2\0\1\3\1\54\1\0\1\55\16\0\1\56\1\55"+
    "\3\0\12\3\1\254\22\3\1\0\1\55\2\0\1\3"+
    "\1\54\1\0\1\55\16\0\1\56\1\55\3\0\26\3"+
    "\1\124\6\3\1\0\1\55\2\0\1\3\1\54\1\0"+
    "\1\55\16\0\1\56\1\55\3\0\17\3\1\255\15\3"+
    "\1\0\1\55\2\0\1\3\1\54\1\0\1\55\16\0"+
    "\1\56\1\55\3\0\13\3\1\124\21\3\1\0\1\55"+
    "\2\0\1\3\1\54\1\0\1\55\16\0\1\56\1\55"+
    "\3\0\6\3\1\256\26\3\1\0\1\55\2\0\1\3"+
    "\1\54\1\0\1\55\16\0\1\56\1\55\3\0\11\3"+
    "\1\257\23\3\1\0\1\55\2\0\1\3\1\54\1\0"+
    "\1\55\16\0\1\56\1\55\3\0\12\3\1\170\1\260"+
    "\21\3\1\0\1\55\2\0\1\3\1\54\1\0\1\55"+
    "\16\0\1\56\1\55\3\0\3\3\1\261\31\3\1\0"+
    "\1\55\2\0\1\3\1\54\1\0\1\55\16\0\1\56"+
    "\1\55\3\0\4\3\1\227\30\3\1\0\1\55\2\0"+
    "\1\3\1\54\1\0\1\55\16\0\1\56\1\55\3\0"+
    "\3\3\1\244\31\3\1\0\1\55\2\0\1\3\1\54"+
    "\1\0\1\55\16\0\1\56\1\55\3\0\3\3\1\262"+
    "\31\3\1\0\1\55\2\0\1\3\1\54\1\0\1\55"+
    "\16\0\1\56\1\55\3\0\31\3\1\263\3\3\1\0"+
    "\1\55\2\0\1\3\1\54\1\0\1\55\16\0\1\56"+
    "\1\55\3\0\6\3\1\264\26\3\1\0\1\55\2\0"+
    "\1\3\1\54\1\0\1\55\16\0\1\56\1\55\3\0"+
    "\27\3\1\265\5\3\1\0\1\55\2\0\1\3\1\54"+
    "\1\0\1\55\16\0\1\56\1\55\3\0\13\3\1\242"+
    "\21\3\1\0\1\55\2\0\1\3\1\54\1\0\1\55"+
    "\16\0\1\56\1\55\3\0\20\3\1\227\14\3\1\0"+
    "\1\55\2\0\1\3\1\54\1\0\1\55\16\0\1\56"+
    "\1\55\3\0\12\3\1\124\22\3\1\0\1\55\2\0"+
    "\1\3\1\54\1\0\1\55\16\0\1\56\1\55\3\0"+
    "\3\3\1\266\31\3\1\0\1\55\2\0\1\3\1\54"+
    "\1\0\1\55\16\0\1\56\1\55\3\0\21\3\1\124"+
    "\13\3\1\0\1\55\2\0\1\3\1\54\1\0\1\55"+
    "\16\0\1\56\1\55\3\0\13\3\1\165\21\3\1\0"+
    "\1\55\2\0\1\3\1\54\1\0\1\55\16\0\1\56"+
    "\1\55\3\0\17\3\1\117\15\3\1\0\1\55\2\0"+
    "\1\232\26\0\35\232\4\0\1\232\1\233\20\0\1\234"+
    "\4\0\1\267\10\232\1\267\23\232\5\0\1\234\20\0"+
    "\1\234\45\0\1\232\1\270\5\0\1\271\12\0\1\272"+
    "\4\0\35\232\35\0\1\273\36\0\1\3\1\54\1\0"+
    "\1\55\16\0\1\56\1\55\3\0\7\3\1\274\25\3"+
    "\1\0\1\55\2\0\1\3\1\54\1\0\1\55\16\0"+
    "\1\56\1\55\3\0\11\3\1\275\23\3\1\0\1\55"+
    "\2\0\1\3\1\54\1\0\1\55\16\0\1\56\1\55"+
    "\3\0\17\3\1\276\15\3\1\0\1\55\2\0\1\3"+
    "\1\54\1\0\1\55\16\0\1\56\1\55\3\0\7\3"+
    "\1\277\25\3\1\0\1\55\2\0\1\3\1\54\1\0"+
    "\1\55\16\0\1\56\1\55\3\0\6\3\1\124\26\3"+
    "\1\0\1\55\2\0\1\3\1\54\1\0\1\55\16\0"+
    "\1\56\1\55\3\0\5\3\1\300\27\3\1\0\1\55"+
    "\2\0\1\3\1\54\1\0\1\55\16\0\1\56\1\55"+
    "\3\0\30\3\1\301\4\3\1\0\1\55\2\0\1\3"+
    "\1\54\1\0\1\55\16\0\1\56\1\55\3\0\7\3"+
    "\1\302\25\3\1\0\1\55\2\0\1\3\1\54\1\0"+
    "\1\55\16\0\1\56\1\55\3\0\17\3\1\303\15\3"+
    "\1\0\1\55\2\0\1\3\1\54\1\0\1\55\16\0"+
    "\1\56\1\55\3\0\16\3\1\124\16\3\1\0\1\55"+
    "\2\0\1\3\1\54\1\0\1\55\16\0\1\56\1\55"+
    "\3\0\17\3\1\304\15\3\1\0\1\55\2\0\1\3"+
    "\1\54\1\0\1\55\16\0\1\56\1\55\3\0\14\3"+
    "\1\305\20\3\1\0\1\55\2\0\1\3\1\54\1\0"+
    "\1\55\16\0\1\56\1\55\3\0\7\3\1\306\25\3"+
    "\1\0\1\55\2\0\1\3\1\54\1\0\1\55\16\0"+
    "\1\56\1\55\3\0\27\3\1\165\5\3\1\0\1\55"+
    "\2\0\1\3\1\54\1\0\1\55\16\0\1\56\1\55"+
    "\3\0\3\3\1\307\31\3\1\0\1\55\2\0\1\3"+
    "\1\54\1\0\1\55\16\0\1\56\1\55\3\0\7\3"+
    "\1\310\25\3\1\0\1\55\2\0\1\3\1\54\1\0"+
    "\1\55\16\0\1\56\1\55\3\0\11\3\1\311\23\3"+
    "\1\0\1\55\2\0\1\3\1\54\1\0\1\55\16\0"+
    "\1\56\1\55\3\0\20\3\1\312\14\3\1\0\1\55"+
    "\2\0\1\3\1\54\1\0\1\55\16\0\1\56\1\55"+
    "\3\0\13\3\1\313\21\3\1\0\1\55\2\0\1\3"+
    "\1\54\1\0\1\55\16\0\1\56\1\55\3\0\3\3"+
    "\1\314\31\3\1\0\1\55\2\0\1\3\1\54\1\0"+
    "\1\55\16\0\1\56\1\55\3\0\11\3\1\315\23\3"+
    "\1\0\1\55\2\0\1\3\1\54\1\0\1\55\16\0"+
    "\1\56\1\55\3\0\3\3\1\100\31\3\1\0\1\55"+
    "\2\0\1\3\1\54\1\0\1\55\16\0\1\56\1\55"+
    "\3\0\6\3\1\142\26\3\1\0\1\55\2\0\1\232"+
    "\1\316\5\0\1\316\12\0\1\272\4\0\35\232\5\0"+
    "\1\270\20\0\1\272\46\0\1\317\76\0\1\320\57\0"+
    "\1\3\1\54\1\0\1\55\16\0\1\56\1\55\3\0"+
    "\3\3\1\321\31\3\1\0\1\55\2\0\1\3\1\54"+
    "\1\0\1\55\16\0\1\56\1\55\3\0\3\3\1\302"+
    "\31\3\1\0\1\55\2\0\1\3\1\54\1\0\1\55"+
    "\16\0\1\56\1\55\3\0\10\3\1\124\24\3\1\0"+
    "\1\55\2\0\1\3\1\54\1\0\1\55\16\0\1\56"+
    "\1\55\3\0\12\3\1\322\22\3\1\0\1\55\2\0"+
    "\1\3\1\54\1\0\1\55\16\0\1\56\1\55\3\0"+
    "\17\3\1\323\15\3\1\0\1\55\2\0\1\3\1\54"+
    "\1\0\1\55\16\0\1\56\1\55\3\0\14\3\1\124"+
    "\20\3\1\0\1\55\2\0\1\3\1\54\1\0\1\55"+
    "\16\0\1\56\1\55\3\0\7\3\1\324\25\3\1\0"+
    "\1\55\2\0\1\3\1\54\1\0\1\55\16\0\1\56"+
    "\1\55\3\0\14\3\1\325\20\3\1\0\1\55\2\0"+
    "\1\3\1\54\1\0\1\55\16\0\1\56\1\55\3\0"+
    "\21\3\1\175\13\3\1\0\1\55\2\0\1\3\1\54"+
    "\1\0\1\55\16\0\1\56\1\55\3\0\6\3\1\175"+
    "\26\3\1\0\1\55\2\0\1\3\1\54\1\0\1\55"+
    "\16\0\1\56\1\55\3\0\14\3\1\326\20\3\1\0"+
    "\1\55\2\0\1\3\1\54\1\0\1\55\16\0\1\56"+
    "\1\55\3\0\22\3\1\327\12\3\1\0\1\55\2\0"+
    "\1\3\1\54\1\0\1\55\16\0\1\56\1\55\3\0"+
    "\25\3\1\330\7\3\1\0\1\55\2\0\1\3\1\54"+
    "\1\0\1\55\16\0\1\56\1\55\3\0\13\3\1\244"+
    "\21\3\1\0\1\55\2\0\1\3\1\54\1\0\1\55"+
    "\16\0\1\56\1\55\3\0\13\3\1\331\21\3\1\0"+
    "\1\55\2\0\1\3\1\54\1\0\1\55\16\0\1\56"+
    "\1\55\3\0\26\3\1\165\6\3\1\0\1\55\2\0"+
    "\1\3\1\54\1\0\1\55\16\0\1\56\1\55\3\0"+
    "\10\3\1\332\24\3\1\0\1\55\3\0\1\316\20\0"+
    "\1\272\46\0\1\317\20\0\1\333\55\0\1\334\57\0"+
    "\1\3\1\54\1\0\1\55\16\0\1\56\1\55\3\0"+
    "\10\3\1\244\24\3\1\0\1\55\2\0\1\3\1\54"+
    "\1\0\1\55\16\0\1\56\1\55\3\0\14\3\1\335"+
    "\20\3\1\0\1\55\2\0\1\3\1\54\1\0\1\55"+
    "\16\0\1\56\1\55\3\0\11\3\1\336\23\3\1\0"+
    "\1\55\2\0\1\3\1\54\1\0\1\55\16\0\1\56"+
    "\1\55\3\0\11\3\1\175\23\3\1\0\1\55\2\0"+
    "\1\3\1\54\1\0\1\55\16\0\1\56\1\55\3\0"+
    "\20\3\1\165\14\3\1\0\1\55\2\0\1\3\1\54"+
    "\1\0\1\55\16\0\1\56\1\55\3\0\10\3\1\337"+
    "\24\3\1\0\1\55\2\0\1\3\1\54\1\0\1\55"+
    "\16\0\1\56\1\55\3\0\3\3\1\340\31\3\1\0"+
    "\1\55\2\0\1\3\1\54\1\0\1\55\16\0\1\56"+
    "\1\55\3\0\11\3\1\341\23\3\1\0\1\55\2\0"+
    "\1\3\1\54\1\0\1\55\16\0\1\56\1\55\3\0"+
    "\15\3\1\124\17\3\1\0\1\55\2\0\1\3\1\54"+
    "\1\0\1\55\16\0\1\56\1\55\3\0\6\3\1\342"+
    "\26\3\1\0\1\55\3\0\1\343\66\0\1\3\1\54"+
    "\1\0\1\55\16\0\1\56\1\55\3\0\17\3\1\344"+
    "\15\3\1\0\1\55\2\0\1\3\1\54\1\0\1\55"+
    "\16\0\1\56\1\55\3\0\14\3\1\244\20\3\1\0"+
    "\1\55\2\0\1\3\1\54\1\0\1\55\16\0\1\56"+
    "\1\55\3\0\11\3\1\345\23\3\1\0\1\55\2\0"+
    "\1\3\1\54\1\0\1\55\16\0\1\56\1\55\3\0"+
    "\10\3\1\165\24\3\1\0\1\55\2\0\1\3\1\54"+
    "\1\0\1\55\16\0\1\56\1\55\3\0\14\3\1\306"+
    "\20\3\1\0\1\55\2\0\1\3\1\54\1\0\1\55"+
    "\16\0\1\56\1\55\3\0\11\3\1\226\23\3\1\0"+
    "\1\55\3\0\1\343\25\0\1\346\10\0\1\346\27\0"+
    "\1\3\1\54\1\0\1\55\16\0\1\56\1\55\3\0"+
    "\33\3\1\342\1\3\1\0\1\55\2\0\1\3\1\54"+
    "\1\0\1\55\16\0\1\56\1\55\3\0\12\3\1\347"+
    "\22\3\1\0\1\55\3\0\1\316\5\0\1\316\12\0"+
    "\1\272\45\0\1\3\1\54\1\0\1\55\16\0\1\56"+
    "\1\55\3\0\22\3\1\124\12\3\1\0\1\55\1\0";

  private static int [] zzUnpackTrans() {
    int [] result = new int[11592];
    int offset = 0;
    offset = zzUnpackTrans(ZZ_TRANS_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackTrans(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      value--;
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /* error codes */
  private static final int ZZ_UNKNOWN_ERROR = 0;
  private static final int ZZ_NO_MATCH = 1;
  private static final int ZZ_PUSHBACK_2BIG = 2;

  /* error messages for the codes above */
  private static final String ZZ_ERROR_MSG[] = {
    "Unkown internal scanner error",
    "Error: could not match input",
    "Error: pushback value was too large"
  };

  /**
   * ZZ_ATTRIBUTE[aState] contains the attributes of state <code>aState</code>
   */
  private static final int [] ZZ_ATTRIBUTE = zzUnpackAttribute();

  private static final String ZZ_ATTRIBUTE_PACKED_0 =
    "\1\1\1\11\2\1\1\11\1\1\2\11\3\1\1\11"+
    "\1\1\1\11\2\1\4\11\31\1\1\0\2\1\1\0"+
    "\1\1\5\11\1\0\1\1\1\0\51\1\1\11\1\1"+
    "\1\0\1\1\2\0\3\1\4\0\50\1\1\11\4\1"+
    "\1\0\1\11\31\1\1\0\1\1\1\0\22\1\1\0"+
    "\1\1\1\0\12\1\1\0\1\11\6\1\1\0\2\1"+
    "\1\0\1\1";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[231];
    int offset = 0;
    offset = zzUnpackAttribute(ZZ_ATTRIBUTE_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAttribute(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }

  /** the input device */
  private java.io.Reader zzReader;

  /** the current state of the DFA */
  private int zzState;

  /** the current lexical state */
  private int zzLexicalState = YYINITIAL;

  /** this buffer contains the current text to be matched and is
      the source of the yytext() string */
  private char zzBuffer[] = new char[ZZ_BUFFERSIZE];

  /** the textposition at the last accepting state */
  private int zzMarkedPos;

  /** the current text position in the buffer */
  private int zzCurrentPos;

  /** startRead marks the beginning of the yytext() string in the buffer */
  private int zzStartRead;

  /** endRead marks the last character in the buffer, that has been read
      from input */
  private int zzEndRead;

  /** number of newlines encountered up to the start of the matched text */
  private int yyline;

  /** the number of characters up to the start of the matched text */
  private int yychar;

  /**
   * the number of characters from the last newline up to the start of the 
   * matched text
   */
  private int yycolumn;

  /** 
   * zzAtBOL == true <=> the scanner is currently at the beginning of a line
   */
  private boolean zzAtBOL = true;

  /** zzAtEOF == true <=> the scanner is at the EOF */
  private boolean zzAtEOF;

  /** denotes if the user-EOF-code has already been executed */
  private boolean zzEOFDone;

  /* user code: */
public String lexeme;


  /**
   * Creates a new scanner
   * There is also a java.io.InputStream version of this constructor.
   *
   * @param   in  the java.io.Reader to read input from.
   */
  Lexer(java.io.Reader in) {
    this.zzReader = in;
  }

  /**
   * Creates a new scanner.
   * There is also java.io.Reader version of this constructor.
   *
   * @param   in  the java.io.Inputstream to read input from.
   */
  Lexer(java.io.InputStream in) {
    this(new java.io.InputStreamReader(in));
  }

  /** 
   * Unpacks the compressed character translation table.
   *
   * @param packed   the packed character translation table
   * @return         the unpacked character translation table
   */
  private static char [] zzUnpackCMap(String packed) {
    char [] map = new char[0x10000];
    int i = 0;  /* index in packed string  */
    int j = 0;  /* index in unpacked array */
    while (i < 196) {
      int  count = packed.charAt(i++);
      char value = packed.charAt(i++);
      do map[j++] = value; while (--count > 0);
    }
    return map;
  }


  /**
   * Refills the input buffer.
   *
   * @return      <code>false</code>, iff there was new input.
   * 
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  private boolean zzRefill() throws java.io.IOException {

    /* first: make room (if you can) */
    if (zzStartRead > 0) {
      System.arraycopy(zzBuffer, zzStartRead,
                       zzBuffer, 0,
                       zzEndRead-zzStartRead);

      /* translate stored positions */
      zzEndRead-= zzStartRead;
      zzCurrentPos-= zzStartRead;
      zzMarkedPos-= zzStartRead;
      zzStartRead = 0;
    }

    /* is the buffer big enough? */
    if (zzCurrentPos >= zzBuffer.length) {
      /* if not: blow it up */
      char newBuffer[] = new char[zzCurrentPos*2];
      System.arraycopy(zzBuffer, 0, newBuffer, 0, zzBuffer.length);
      zzBuffer = newBuffer;
    }

    /* finally: fill the buffer with new input */
    int numRead = zzReader.read(zzBuffer, zzEndRead,
                                            zzBuffer.length-zzEndRead);

    if (numRead > 0) {
      zzEndRead+= numRead;
      return false;
    }
    // unlikely but not impossible: read 0 characters, but not at end of stream    
    if (numRead == 0) {
      int c = zzReader.read();
      if (c == -1) {
        return true;
      } else {
        zzBuffer[zzEndRead++] = (char) c;
        return false;
      }     
    }

	// numRead < 0
    return true;
  }

    
  /**
   * Closes the input stream.
   */
  public final void yyclose() throws java.io.IOException {
    zzAtEOF = true;            /* indicate end of file */
    zzEndRead = zzStartRead;  /* invalidate buffer    */

    if (zzReader != null)
      zzReader.close();
  }


  /**
   * Resets the scanner to read from a new input stream.
   * Does not close the old reader.
   *
   * All internal variables are reset, the old input stream 
   * <b>cannot</b> be reused (internal buffer is discarded and lost).
   * Lexical state is set to <tt>ZZ_INITIAL</tt>.
   *
   * @param reader   the new input stream 
   */
  public final void yyreset(java.io.Reader reader) {
    zzReader = reader;
    zzAtBOL  = true;
    zzAtEOF  = false;
    zzEOFDone = false;
    zzEndRead = zzStartRead = 0;
    zzCurrentPos = zzMarkedPos = 0;
    yyline = yychar = yycolumn = 0;
    zzLexicalState = YYINITIAL;
  }


  /**
   * Returns the current lexical state.
   */
  public final int yystate() {
    return zzLexicalState;
  }


  /**
   * Enters a new lexical state
   *
   * @param newState the new lexical state
   */
  public final void yybegin(int newState) {
    zzLexicalState = newState;
  }


  /**
   * Returns the text matched by the current regular expression.
   */
  public final String yytext() {
    return new String( zzBuffer, zzStartRead, zzMarkedPos-zzStartRead );
  }


  /**
   * Returns the character at position <tt>pos</tt> from the 
   * matched text. 
   * 
   * It is equivalent to yytext().charAt(pos), but faster
   *
   * @param pos the position of the character to fetch. 
   *            A value from 0 to yylength()-1.
   *
   * @return the character at position pos
   */
  public final char yycharat(int pos) {
    return zzBuffer[zzStartRead+pos];
  }


  /**
   * Returns the length of the matched text region.
   */
  public final int yylength() {
    return zzMarkedPos-zzStartRead;
  }


  /**
   * Reports an error that occured while scanning.
   *
   * In a wellformed scanner (no or only correct usage of 
   * yypushback(int) and a match-all fallback rule) this method 
   * will only be called with things that "Can't Possibly Happen".
   * If this method is called, something is seriously wrong
   * (e.g. a JFlex bug producing a faulty scanner etc.).
   *
   * Usual syntax/scanner level error handling should be done
   * in error fallback rules.
   *
   * @param   errorCode  the code of the errormessage to display
   */
  private void zzScanError(int errorCode) {
    String message;
    try {
      message = ZZ_ERROR_MSG[errorCode];
    }
    catch (ArrayIndexOutOfBoundsException e) {
      message = ZZ_ERROR_MSG[ZZ_UNKNOWN_ERROR];
    }

    throw new Error(message);
  } 


  /**
   * Pushes the specified amount of characters back into the input stream.
   *
   * They will be read again by then next call of the scanning method
   *
   * @param number  the number of characters to be read again.
   *                This number must not be greater than yylength()!
   */
  public void yypushback(int number)  {
    if ( number > yylength() )
      zzScanError(ZZ_PUSHBACK_2BIG);

    zzMarkedPos -= number;
  }


  /**
   * Resumes scanning until the next regular expression is matched,
   * the end of input is encountered or an I/O-Error occurs.
   *
   * @return      the next token
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  public Tokens yylex() throws java.io.IOException {
    int zzInput;
    int zzAction;

    // cached fields:
    int zzCurrentPosL;
    int zzMarkedPosL;
    int zzEndReadL = zzEndRead;
    char [] zzBufferL = zzBuffer;
    char [] zzCMapL = ZZ_CMAP;

    int [] zzTransL = ZZ_TRANS;
    int [] zzRowMapL = ZZ_ROWMAP;
    int [] zzAttrL = ZZ_ATTRIBUTE;

    while (true) {
      zzMarkedPosL = zzMarkedPos;

      zzAction = -1;

      zzCurrentPosL = zzCurrentPos = zzStartRead = zzMarkedPosL;
  
      zzState = ZZ_LEXSTATE[zzLexicalState];


      zzForAction: {
        while (true) {
    
          if (zzCurrentPosL < zzEndReadL)
            zzInput = zzBufferL[zzCurrentPosL++];
          else if (zzAtEOF) {
            zzInput = YYEOF;
            break zzForAction;
          }
          else {
            // store back cached positions
            zzCurrentPos  = zzCurrentPosL;
            zzMarkedPos   = zzMarkedPosL;
            boolean eof = zzRefill();
            // get translated positions and possibly new buffer
            zzCurrentPosL  = zzCurrentPos;
            zzMarkedPosL   = zzMarkedPos;
            zzBufferL      = zzBuffer;
            zzEndReadL     = zzEndRead;
            if (eof) {
              zzInput = YYEOF;
              break zzForAction;
            }
            else {
              zzInput = zzBufferL[zzCurrentPosL++];
            }
          }
          int zzNext = zzTransL[ zzRowMapL[zzState] + zzCMapL[zzInput] ];
          if (zzNext == -1) break zzForAction;
          zzState = zzNext;

          int zzAttributes = zzAttrL[zzState];
          if ( (zzAttributes & 1) == 1 ) {
            zzAction = zzState;
            zzMarkedPosL = zzCurrentPosL;
            if ( (zzAttributes & 8) == 8 ) break zzForAction;
          }

        }
      }

      // store back cached position
      zzMarkedPos = zzMarkedPosL;

      switch (zzAction < 0 ? zzAction : ZZ_ACTION[zzAction]) {
        case 10: 
          { lexeme=yytext(); return OPERADOR_MAYOR_QUE;
          }
        case 32: break;
        case 14: 
          { lexeme=yytext(); return OPERADOR_DIVISION;
          }
        case 33: break;
        case 30: 
          { lexeme=yytext(); return LITERAL_NUM_FLOTANTE;
          }
        case 34: break;
        case 21: 
          { lexeme=yytext(); return ERROR;
          }
        case 35: break;
        case 18: 
          { lexeme=yytext(); return OPERADOR_CORCHETE_CERRAR;
          }
        case 36: break;
        case 13: 
          { lexeme=yytext(); return OPERADOR_MULTIPLICACION;
          }
        case 37: break;
        case 5: 
          { /*No se procesa*/
          }
        case 38: break;
        case 31: 
          { lexeme=yytext(); return OPERADOR;
          }
        case 39: break;
        case 28: 
          { lexeme=yytext(); return PALABRA_RESERVADA;
          }
        case 40: break;
        case 16: 
          { lexeme=yytext(); return OPERADOR_PARENTESIS_CERRAR;
          }
        case 41: break;
        case 26: 
          { lexeme=yytext(); return OPERADOR_DIFERENTE_DE;
          }
        case 42: break;
        case 22: 
          { lexeme=yytext(); return ERROR_IDENTIFICADOR;
          }
        case 43: break;
        case 19: 
          { lexeme=yytext(); return OPERADOR_DOS_PUNTOS;
          }
        case 44: break;
        case 8: 
          { lexeme=yytext(); return OPERADOR_ADICION;
          }
        case 45: break;
        case 15: 
          { lexeme=yytext(); return OPERADOR_PARENTESIS_ABRIR;
          }
        case 46: break;
        case 17: 
          { lexeme=yytext(); return OPERADOR_CORCHETE_ABRIR;
          }
        case 47: break;
        case 6: 
          { lexeme=yytext(); return OPERADOR_COMA;
          }
        case 48: break;
        case 25: 
          { lexeme=yytext(); return OPERADOR_MAYOR_IGUAL_QUE;
          }
        case 49: break;
        case 4: 
          { lexeme=yytext(); return LITERAL_NUM_ENTERO;
          }
        case 50: break;
        case 27: 
          { lexeme=yytext(); return OPERADOR_MENOR_IGUAL_QUE;
          }
        case 51: break;
        case 24: 
          { lexeme=yytext(); return OPERADOR_DISMINUCION;
          }
        case 52: break;
        case 7: 
          { lexeme=yytext(); return TERMINADOR;
          }
        case 53: break;
        case 2: 
          { return ERROR;
          }
        case 54: break;
        case 23: 
          { lexeme=yytext(); return OPERADOR_INCREMENTO;
          }
        case 55: break;
        case 3: 
          { lexeme=yytext(); return IDENTIFICADOR;
          }
        case 56: break;
        case 1: 
          { lexeme=yytext(); return ERROR_LITERAL;
          }
        case 57: break;
        case 29: 
          { lexeme=yytext(); return LITERAL_STRING;
          }
        case 58: break;
        case 9: 
          { lexeme=yytext(); return OPERADOR_SUSTRACCION;
          }
        case 59: break;
        case 11: 
          { lexeme=yytext(); return OPERADOR_IGUAL;
          }
        case 60: break;
        case 12: 
          { lexeme=yytext(); return OPERADOR_MENOR_QUE;
          }
        case 61: break;
        case 20: 
          { lexeme=yytext(); return OPERADOR_PUNTO;
          }
        case 62: break;
        default: 
          if (zzInput == YYEOF && zzStartRead == zzCurrentPos) {
            zzAtEOF = true;
            return null;
          } 
          else {
            zzScanError(ZZ_NO_MATCH);
          }
      }
    }
  }


}