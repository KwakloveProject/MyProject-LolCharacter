package myfirstpoject;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LolCharacter      
{
	private  static String[] lolcharname;
	
	public static String[] getLolcharname() 
	{
		return lolcharname;
	}
	
	public static  void setLolcharname(String[] lolcharname) 
	{
		LolCharacter.lolcharname = lolcharname;
	}

	public static String[] AssassinLolCharacter() //암살자 캐릭터
	{
		String name="naafiri/나피리 nocturne/녹턴 nidalee/니달리 rengar/렝가 leblanc/르블랑 masterYi/마스터이 viego/비에고 shaco/샤코 akali/아칼리 ekko/에코 yone/요네 evelynn/이블린 zed/제드 kassadin/카사딘 khazix/카직스 katarina/카타리나 qiyana/키아나 talon/탈론 fizz/피즈 gwen/그웬 nilah/닐라 leeSin/리신 riven/리븐 malzahar/말자하 vi/바이 vayne/베인 briar/브라이어 sylas/사일러스 xinZhao/신짜오 ahri/아리 akshan/아크샨 yasuo/야스오 irelia/이렐리아 jax/잭스 kayn/케인 quinn/퀸 tristana/트리스타나 tryndamere/트린다미어 twitch/트위치 teemo/티모 pyke/파이크 pantheon/판테온 fiora/피오라";
		String[] lolname =name.split(" ");
		setLolcharname(lolname);
		return getLolcharname();
	}

	public static String[] WarriorLolCharacter() //전사 캐릭터
	{
		String name="garen/가렌 gangplank/갱플랭크 Gragas/그라가스 gwen/그웬  gnar/나르 nasus/나서스 nilah/닐라 darius/다리우스 diana/다이애나 rumble/럼블 renekton/레넥톤 reksai/렉사이 leeSin/리신 riven/리븐 /릴리아 mordekaiser/모데카이저 DrMundo/문도 박사 vi/바이 belveth/벨베스 volibear/볼리베어 briar/ 브라이어 sett/세트 shyvana/쉬바나 skarner/스카너 xinZhao/신 짜오 aatrox/아트록스 yasuo/야스오 wukong/오공 olaf/올라프 yorick/요릭 udyr/우디르 urgot/우르곳 warwick/워윅 irelia/이렐리아 illaoi/일라오이 jax/잭스 jayce/제이스 camille/카밀 kayn/케인 kayle/케일 kled/클레드 trundle/트런들 tryndamere/트린다미어 pantheon/판테온 fiora/피오라 Hecarim/헤카림 nocturne/녹턴 nunuWillump/누누와윌럼프 ryze/라이즈 rammus/람머스 rengar/렝가 masterYi/마스터 이 malphite/말파이트 vladimir/블라디미르 viego/비에고 poppy/뽀삐 sion/사이온 sejuani/세주아니 swain/스웨인 singed/신지드 thresh/쓰레쉬 ekko/에코 elise/엘리스 ornn/오른 yone/요네 jarvanIV/자르반4세 zac/자크 ksante/크산테 qiyana/키아나 taric/타릭 fizz/피즈";
		String[] lolname =name.split(" ");
		setLolcharname(lolname);
		return getLolcharname();
	}
	public static String[] MageLolCharacter() //메이지 (마법사)
	{
		String name ="neeko/니코 ryze/라이즈 lux/럭스 lissandra/리산드라 malzahar/말자하 morgana/모르가나 veigar/베이가 vex/벡스 velkoz/벨코즈 brand/브랜드 vladimir/블라디미르 viktor/빅토르 sylas/사일러스 seraphine/세라핀 swain/스웨인 syndra/신드라 ahri/아리 aurelionSol/아우렐리온솔 azir/아지르 annie/애니 anivia/애니비아 elise/엘리스 orianna/오리아나 zyra/자이라 xerath/제라스 zoe/조이 ziggs/직스 karma/카르마 karthus/카서스 cassiopeia/카시오페아 kennen/케넨 taliyah/탈리야 twistedFate/트위스티드 페이트 fiddlesticks/피들스틱 heimerdinger/하이머딩거 hwei/흐웨이 galio/갈리오 gragas/그라가스 nami/나미 nidalee/니달리 diana/다이애나 rumble/럼블 lulu/룰루 leblanc/르블랑 lillia/릴리아 maokai/마오카이 bard/바드 varus/바루스 sona/소나 soraka/소라카 amumu/아무무 ivern/아이번 yuumi/유미 evelynn/이블린 janna/잔나 zilean/질리언 chogath/초가스 kassadin/카사딘 katarina/카타리나";
		String[] lolname =name.split(" ");
		setLolcharname(lolname);
		return getLolcharname();
	}
	public static String[] AdLolCharacter() // 원거리딜러
	{
		String name ="draven/드레이븐 lucian/루시안 missFortune/미스포츈 varus/바루스 vayne/베인 samira/사미라 senna/세나 smolder/스몰더 sivir/시비르 akshan/아크샨 aphelios/아펠리오스 ashe/애쉬 ezreal/이즈리얼 xayah/자야 zeri/제리 jhin/진 jinx/징크스 kaisa/카이사 kalista/ 칼리스타 caitlyn/케이틀린 kogmaw/코그모 corki/코르키 quinn/퀸 kindred/킨드레드 tristana/ 트리스타나 twitch/트위치 teemo/티모";
		String[] lolname =name.split(" ");
		setLolcharname(lolname);
		return getLolcharname();
	} 
	public static String[] SupporterLolCharacter() // 서포터
	{
		String name="nami/나미 rakan/라칸 renataGlasc/레나타글라스크 lulu/룰루 milio/밀리오 bard/바드 braum/브라움 sona/소나 soraka/소라카 thresh/쓰레쉬 ivern/아이번 yuumi/유미 janna/잔나 zilean/질리언 taric/타릭 tahmKench/탐켄치 pyke/파이크 nautilus/노틸러스 neeko/니코 lux/럭스 leona/레오나 rell/렐 morgana/모르가나 senna/세나 seraphine/세라핀 alistar/알리스타 anivia/애니비아 ashe/애쉬 orianna/오리아나 zyra/자이라 zoe/조이 karma/카르마 kayle/케일 taliyah/탈리야 fiddlesticks/피들스틱 heimerdinger/하이머딩거 hwei/흐웨이";
		String[] lolname =name.split(" ");
		setLolcharname(lolname);
		return getLolcharname();
	}
	public static String[] TankerLolCharacter() // 탱커
	{
		String name ="galio/갈리오 nautilus/노틸러스 nunuWillump/누누와윌럼프 rammus/람머스 leona/레오나 rell/렐 maokai/마오카이 malphite/말파이트 blitzcrank/블리츠크랭크 poppy/뽀삐 sion/사이온 sejuani/세주아니 shen/쉔 singed/신지드 amumu/아무무 alistar/알리스타 ornn/오른 jarvanIV/자르반 4세 chogath/초가스 ksante/크산테 garen/가렌 gnar/나르 nasus/나서스/문도박사 volibear/볼리베어 braum/브라움 sett/세트 shyvana/쉬바나 skarner/스카너 aatrox/아트록스 wukong/오공 olaf/올라프 yorick/요릭 udyr/우디르 urgot/우르곳 warwick/워윅 illaoi/일라오이 tahmKench/탐켄치 trundle/트런들 Hecarim/헤카림";
		String[] lolname =name.split(" ");
		setLolcharname(lolname);
		return getLolcharname();
	}

	public static void newChampPut() 
	{
		
		
		
	}


	



}
	
	


