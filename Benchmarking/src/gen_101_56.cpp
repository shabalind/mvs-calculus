  #include <vector>
  #include <iostream>
  #include <chrono>
  struct s0 {
    std::vector<std::vector<double>> p0;
    std::vector<std::vector<double>> p1;
    std::vector<std::vector<double>> p2;
    s0(std::vector<std::vector<double>> v0, std::vector<std::vector<double>> v1, std::vector<std::vector<double>> v2): p0(v0), p1(v1), p2(v2) { }
  };
  struct s1 {
    std::vector<s0> p0;
    s0 p1;
    s1(std::vector<s0> v0, s0 v1): p0(v0), p1(v1) { }
  };
  struct s2 {
    s1 p0;
    s0 p1;
    s2(s1 v0, s0 v1): p0(v0), p1(v1) { }
  };
  struct s3 {
    std::vector<std::vector<s2>> p0;
    std::vector<s2> p1;
    s3(std::vector<std::vector<s2>> v0, std::vector<s2> v1): p0(v0), p1(v1) { }
  };
  s2 f111(const s2 &v0) {
    s2 v4 = v0;
    return v4;
  }
  s0 f108(const s0 &v0) {
    s0 v5 = v0;
    s0 v4 = v5;
    const std::vector<std::vector<double>> v3 = v4.p0;
    v4.p0 = v3;
    s0 v1 = v4;
    const std::vector<std::vector<double>> v8 = v1.p2;
    const std::vector<std::vector<double>> v2 = v1.p0;
    const std::vector<std::vector<std::vector<double>>> v6 { v8, v8, v8, v8, v8 };
    const std::vector<std::vector<double>> v11 = v6[1];
    s0 v17 = v4;
    v1.p2 = v8;
    v5.p0 = v2;
    const std::vector<std::vector<double>> v20 = v6[1];
    const std::vector<std::vector<double>> v35 = v1.p0;
    v17.p2 = v11;
    v1.p2 = v20;
    v4.p2 = v8;
    v5.p0 = v35;
    return v17;
  }
  s1 f106(const s1 &v0) {
    const s0 v5 = v0.p1;
    const s0 v1 = f108(v5);
    s1 v6 = v0;
    const s0 v3 = f108(v5);
    v6.p1 = v1;
    s1 v7 = v6;
    const s0 v2 = f108(v3);
    const s0 v9 = f108(v5);
    v6.p1 = v2;
    const std::vector<s0> v11 = v7.p0;
    const s0 v17 = f108(v9);
    const s0 v22 = f108(v17);
    std::vector<s0> v19 = v11;
    const s0 v44 = f108(v17);
    v6.p1 = v9;
    std::vector<s0> v24 = v19;
    v19[0] = v22;
    v24[0] = v9;
    const s2 v42(v7, v44);
    v6.p0 = v24;
    const s2 v108 = f111(v42);
    const s1 v55 = v108.p0;
    v24[0] = v44;
    v6.p1 = v9;
    return v55;
  }
  s0 f103(const s2 &v0, const s0 &v1) {
    s2 v6 = v0;
    const s0 v3 = f108(v1);
    v6.p1 = v1;
    const s0 v8 = v6.p1;
    v6 = v0;
    v6.p1 = v8;
    v6.p1 = v3;
    const s0 v14 = f108(v8);
    const s0 v13 = f108(v3);
    s0 v25 = v3;
    const std::vector<s0> v26 { v8, v3, v14, v25, v3 };
    v6.p1 = v13;
    const s0 v56 = v26[2];
    return v56;
  }
  s2 f102(const s1 &v0, const s2 &v1) {
    const s2 v6 = f111(v1);
    return v6;
  }
  s0 f100(const s0 &v0) {
    s0 v4 = v0;
    const std::vector<std::vector<double>> v6 = v0.p0;
    const std::vector<double> v1 = v6[2];
    v4.p0 = v6;
    const std::vector<std::vector<double>> v5 = v4.p2;
    const std::vector<double> v2 = v5[0];
    const std::vector<std::vector<double>> v9 = v4.p0;
    v4.p2 = v5;
    const std::vector<std::vector<double>> v8 = v4.p2;
    std::vector<std::vector<double>> v3 = v6;
    v4.p0 = v9;
    std::vector<std::vector<double>> v7 = v5;
    std::vector<double> v18 = v1;
    const std::vector<std::vector<double>> v10 = v0.p2;
    std::vector<std::vector<double>> v11 = v10;
    v11[0] = v1;
    const s0 v20 = f108(v4);
    std::vector<std::vector<double>> v12 = v3;
    v4.p2 = v11;
    const s0 v15 = f108(v20);
    v7[0] = v18;
    v11[0] = v2;
    const std::vector<std::vector<double>> v31 = v15.p1;
    const double v16 = v2[0];
    v12[0] = v1;
    v4.p2 = v10;
    v4.p2 = v7;
    v7[0] = v18;
    std::vector<std::vector<double>> v36 = v9;
    v4.p2 = v5;
    v4.p0 = v12;
    v18[0] = v16;
    const std::vector<double> v29 = v31[1];
    const std::vector<double> v46 = v10[0];
    v18[0] = v16;
    std::vector<std::vector<double>> v62 = v10;
    const std::vector<double> v96 = v7[0];
    v36 = v6;
    v36[1] = v18;
    const std::vector<double> v75 = v8[0];
    std::vector<std::vector<double>> v32 = v12;
    v4.p2 = v62;
    std::vector<double> v68 = v29;
    const std::vector<std::vector<double>> v77 = v15.p2;
    v18 = v2;
    std::vector<std::vector<double>> v101 = v7;
    v11 = v77;
    v101[0] = v96;
    v62[0] = v75;
    std::vector<std::vector<double>> v66 = v31;
    const s0 v87(v36, v66, v101);
    v101[0] = v68;
    v7 = v77;
    const std::vector<double> v121 = v32[2];
    v36[1] = v96;
    v66[1] = v46;
    v66[1] = v121;
    return v87;
  }
  s2 f98(const s2 &v0) {
    const s1 v3 = v0.p0;
    const std::vector<s2> v2 { v0 };
    const s0 v10 = v3.p1;
    const s2 v5 = v2[0];
    const s2 v39(v3, v10);
    const s1 v38 = v39.p0;
    const s2 v62 = f102(v38, v5);
    return v62;
  }
  s2 f89(const s2 &v0) {
    s2 v4 = v0;
    const s1 v1 = v4.p0;
    v4.p0 = v1;
    const s2 v2 = f111(v0);
    s1 v5 = v1;
    const s0 v6 = v2.p1;
    const s2 v10 = f111(v2);
    s1 v12 = v5;
    const s1 v14 = v10.p0;
    const s0 v20 = f103(v4, v6);
    s1 v17 = v1;
    v4.p1 = v20;
    const s1 v16 = v10.p0;
    const std::vector<s0> v9 = v14.p0;
    const s0 v24 = f100(v20);
    v12.p0 = v9;
    s2 v67 = v0;
    const s2 v49 = f102(v12, v67);
    const s2 v90 = f102(v16, v49);
    v12.p0 = v9;
    v67.p1 = v24;
    const s2 v117 = f102(v17, v90);
    return v117;
  }
  s1 f88(const s1 &v0) {
    const s1 v1 = f106(v0);
    const s1 v2 = f106(v0);
    const s0 v5 = v1.p1;
    const s0 v6 = f108(v5);
    const s0 v3 = f100(v5);
    s1 v14 = v1;
    const s0 v8 = v1.p1;
    v14.p1 = v8;
    s1 v16 = v14;
    v16.p1 = v6;
    v14.p1 = v8;
    v14.p1 = v3;
    const std::vector<s0> v57 = v2.p0;
    v14.p0 = v57;
    return v16;
  }
  s0 f84(const s0 &v0) {
    s0 v5 = v0;
    const std::vector<std::vector<double>> v7 = v0.p1;
    const std::vector<std::vector<double>> v4 = v5.p0;
    std::vector<std::vector<double>> v8 = v7;
    const std::vector<double> v1 = v7[1];
    std::vector<std::vector<double>> v3 = v7;
    std::vector<double> v2 = v1;
    const std::vector<std::vector<double>> v6 = v5.p0;
    const double v9 = v1[0];
    const std::vector<double> v13 = v7[1];
    const std::vector<std::vector<double>> v11 = v0.p2;
    const s0 v21 = f108(v5);
    const std::vector<std::vector<double>> v10 = v5.p2;
    const std::vector<double> v12 = v10[0];
    v2[0] = v9;
    v3 = v7;
    v5.p0 = v6;
    const double v15 = v2[0];
    v5.p0 = v4;
    const s0 v19(v4, v3, v11);
    const s0 v24 = f108(v19);
    const double v74 = v13[0];
    double v36 = v15;
    const std::vector<std::vector<double>> v32 = v19.p0;
    const double v26 = v36 + v74;
    const s0 v20 = f108(v24);
    const std::vector<std::vector<double>> v69 = v24.p2;
    const s0 v28 = f100(v20);
    const std::vector<double> v59 = v32[2];
    const std::vector<std::vector<double>> v38 = v24.p0;
    const std::vector<std::vector<double>> v22 = v28.p2;
    const std::vector<double> v39 = v69[0];
    const std::vector<std::vector<double>> v30 = v21.p0;
    v5.p0 = v4;
    const s0 v161(v30, v8, v22);
    const std::vector<std::vector<double>> v53 = v21.p1;
    const s0 v79 = f108(v161);
    const std::vector<double> v132 = v8[0];
    const std::vector<s0> v57 { v161, v161, v79 };
    v5.p2 = v11;
    v8[0] = v2;
    v2[0] = v26;
    v8[0] = v12;
    const s0 v111 = v57[1];
    const s0 v105 = f108(v111);
    v3[1] = v59;
    v2 = v39;
    v5.p0 = v38;
    v5.p1 = v53;
    v3[1] = v132;
    return v105;
  }
  s3 f83(const s3 &v0) {
    return v0;
  }
  s2 f80(const s2 &v0) {
    const s2 v1 = f89(v0);
    const s1 v6 = v1.p0;
    const s1 v2 = f88(v6);
    const s2 v11 = f102(v2, v0);
    return v11;
  }
  s2 f74(const s2 &v0, const s0 &v1) {
    const s0 v7 = f100(v1);
    s2 v8 = v0;
    s0 v6 = v7;
    const s0 v9 = f103(v8, v6);
    const s2 v17 = f111(v0);
    const s0 v21 = v17.p1;
    s2 v51 = v8;
    const s0 v16 = f100(v7);
    const s1 v14 = v51.p0;
    v8.p0 = v14;
    const s1 v36 = v0.p0;
    const s2 v15 = f98(v51);
    s1 v50 = v36;
    v50.p1 = v21;
    const std::vector<std::vector<double>> v39 = v16.p2;
    const s1 v57 = f106(v50);
    v51.p0 = v50;
    const s2 v54 = f102(v57, v15);
    v6.p2 = v39;
    v51.p1 = v9;
    return v54;
  }
  s2 f49(const s2 &v0) {
    s2 v11 = v0;
    const s2 v13 = f89(v11);
    return v13;
  }
  s2 f43(const s0 &v0, const s2 &v1) {
    s2 v5 = v1;
    v5.p1 = v0;
    v5.p1 = v0;
    const s2 v2 = f98(v1);
    const s2 v14 = f74(v2, v0);
    const std::vector<s2> v10 { v2, v5, v14, v2, v5, v1, v5 };
    const s2 v17 = v10[0];
    return v17;
  }
  s1 f42(const s1 &v0) {
    const s1 v4 = f106(v0);
    const s1 v3 = f106(v4);
    const std::vector<s1> v2 { v0, v3 };
    const s1 v9 = v2[0];
    const s1 v52 = f88(v9);
    return v52;
  }
  s0 f38(const s0 &v0) {
    const s0 v1 = f108(v0);
    const s0 v7 = f108(v1);
    s0 v3 = v7;
    v3 = v1;
    const s0 v5 = f100(v1);
    const std::vector<std::vector<double>> v6 = v3.p0;
    s0 v11 = v5;
    v11.p0 = v6;
    s0 v2 = v11;
    const std::vector<double> v9 = v6[2];
    v3.p0 = v6;
    v11.p0 = v6;
    const std::vector<std::vector<double>> v29 = v2.p2;
    const std::vector<std::vector<double>> v14 = v2.p0;
    const std::vector<std::vector<double>> v44 = v0.p2;
    const s0 v43 = f100(v1);
    v2.p0 = v6;
    const std::vector<std::vector<double>> v26 = v43.p2;
    const std::vector<std::vector<double>> v28 = v5.p1;
    std::vector<std::vector<double>> v60 = v14;
    std::vector<std::vector<double>> v42 = v26;
    v11.p0 = v6;
    const s0 v35(v60, v28, v29);
    v2.p2 = v42;
    v11.p2 = v29;
    v11.p1 = v28;
    v3.p2 = v44;
    v11.p2 = v44;
    v60[2] = v9;
    return v35;
  }
  s2 f29(const s2 &v0) {
    s2 v1 = v0;
    const s1 v7 = v1.p0;
    const s2 v6 = f98(v0);
    const s0 v5 = v6.p1;
    v1.p0 = v7;
    s1 v3 = v7;
    v1.p0 = v3;
    const s0 v9 = f103(v0, v5);
    const s2 v2 = f80(v0);
    v1.p1 = v9;
    const std::vector<s2> v15 { v1, v2, v2, v6, v0, v2 };
    const s1 v11 = v2.p0;
    s1 v19 = v7;
    v19.p1 = v9;
    const s2 v25 = v15[2];
    const s0 v24 = v19.p1;
    const s2 v26 = f49(v25);
    const s2 v22 = f111(v26);
    v1.p0 = v11;
    v1.p0 = v7;
    const s2 v93 = f89(v22);
    const s2 v56 = f74(v93, v24);
    const s2 v46 = f98(v56);
    return v46;
  }
  s0 f21(const s0 &v0, const s0 &v1) {
    s0 v7 = v1;
    const s0 v3 = f108(v0);
    const s0 v2 = f38(v0);
    const std::vector<std::vector<double>> v5 = v7.p1;
    const std::vector<std::vector<std::vector<double>>> v4 { v5, v5, v5, v5 };
    const s0 v16 = f38(v1);
    const std::vector<std::vector<double>> v14 = v2.p2;
    const std::vector<std::vector<double>> v28 = v16.p0;
    const std::vector<std::vector<std::vector<double>>> v43 { v28 };
    std::vector<std::vector<std::vector<double>>> v26 = v4;
    std::vector<std::vector<std::vector<double>>> v38 = v43;
    const std::vector<std::vector<double>> v22 = v38[0];
    const std::vector<std::vector<double>> v77 = v26[1];
    const std::vector<std::vector<double>> v44 = v3.p0;
    v38[0] = v44;
    const s0 v73(v22, v77, v14);
    v7.p1 = v5;
    return v73;
  }
  s0 f5(const s0 &v0, const s0 &v1, const s3 &v2, const s0 &v3) {
    const std::vector<s0> v7 { v3, v3, v0, v3, v0, v0, v1 };
    std::vector<s0> v74 = v7;
    const s0 v58 = v74[6];
    std::vector<s0> v69 = v74;
    v74 = v69;
    return v58;
  }
  __attribute__((noinline))
  double f0(const s2 &v0, const std::vector<std::vector<s3>> &v1, const double &v2) {
    const s2 v4 = f29(v0);
    const std::vector<s3> v10 = v1[0];
    s2 v8 = v4;
    const s1 v9 = v0.p0;
    const s0 v3 = v8.p1;
    const s2 v13 = f98(v0);
    const s0 v14 = f103(v13, v3);
    const s0 v17 = f84(v3);
    s0 v11 = v17;
    v8.p1 = v11;
    const s3 v15 = v10[0];
    const std::vector<s1> v34 { v9, v9 };
    s0 v22 = v14;
    const s1 v30 = v34[1];
    const s1 v27 = f42(v30);
    const std::vector<std::vector<double>> v47 = v3.p2;
    v22.p2 = v47;
    v11.p2 = v47;
    const s0 v42 = f21(v3, v11);
    const std::vector<std::vector<double>> v18 = v3.p0;
    const std::vector<double> v71 = v18[0];
    const double v64 = v71[0];
    const std::vector<std::vector<double>> v33 = v14.p2;
    s2 v53 = v4;
    const s2 v80 = f43(v42, v53);
    const s1 v57 = v13.p0;
    const s3 v82 = f83(v15);
    const s0 v88 = v80.p1;
    v8.p1 = v22;
    const s1 v141 = v4.p0;
    const s0 v102 = f103(v80, v14);
    double v85 = v64;
    v53.p0 = v57;
    const std::vector<std::vector<double>> v92 = v102.p2;
    v53.p0 = v30;
    const s0 v66 = f5(v88, v14, v82, v22);
    const s0 v84 = v4.p1;
    v53.p1 = v42;
    const std::vector<std::vector<double>> v69 = v66.p0;
    v11.p2 = v92;
    v11.p0 = v69;
    v53.p1 = v84;
    v11.p0 = v18;
    v8.p0 = v27;
    v11.p2 = v33;
    const double v93 = v85 + v85;
    double v162 = v93;
    v8.p0 = v141;
    return v162;
  }
  int main() {
    s2 v0({ { { { { { 0.0 }, { 1.0 }, { 2.0 } }, { { 3.0 }, { 4.0 } }, { { 5.0 } } } }, { { { 6.0 }, { 7.0 }, { 8.0 } }, { { 9.0 }, { 10.0 } }, { { 11.0 } } } }, { { { 12.0 }, { 13.0 }, { 14.0 } }, { { 15.0 }, { 16.0 } }, { { 17.0 } } } });
    std::vector<std::vector<s3>> v1({ { { { { { { { { { { 18.0 }, { 19.0 }, { 20.0 } }, { { 21.0 }, { 22.0 } }, { { 23.0 } } } }, { { { 24.0 }, { 25.0 }, { 26.0 } }, { { 27.0 }, { 28.0 } }, { { 29.0 } } } }, { { { 30.0 }, { 31.0 }, { 32.0 } }, { { 33.0 }, { 34.0 } }, { { 35.0 } } } } }, { { { { { { { 36.0 }, { 37.0 }, { 38.0 } }, { { 39.0 }, { 40.0 } }, { { 41.0 } } } }, { { { 42.0 }, { 43.0 }, { 44.0 } }, { { 45.0 }, { 46.0 } }, { { 47.0 } } } }, { { { 48.0 }, { 49.0 }, { 50.0 } }, { { 51.0 }, { 52.0 } }, { { 53.0 } } } } } }, { { { { { { { 54.0 }, { 55.0 }, { 56.0 } }, { { 57.0 }, { 58.0 } }, { { 59.0 } } } }, { { { 60.0 }, { 61.0 }, { 62.0 } }, { { 63.0 }, { 64.0 } }, { { 65.0 } } } }, { { { 66.0 }, { 67.0 }, { 68.0 } }, { { 69.0 }, { 70.0 } }, { { 71.0 } } } }, { { { { { { 72.0 }, { 73.0 }, { 74.0 } }, { { 75.0 }, { 76.0 } }, { { 77.0 } } } }, { { { 78.0 }, { 79.0 }, { 80.0 } }, { { 81.0 }, { 82.0 } }, { { 83.0 } } } }, { { { 84.0 }, { 85.0 }, { 86.0 } }, { { 87.0 }, { 88.0 } }, { { 89.0 } } } }, { { { { { { 90.0 }, { 91.0 }, { 92.0 } }, { { 93.0 }, { 94.0 } }, { { 95.0 } } } }, { { { 96.0 }, { 97.0 }, { 98.0 } }, { { 99.0 }, { 100.0 } }, { { 101.0 } } } }, { { { 102.0 }, { 103.0 }, { 104.0 } }, { { 105.0 }, { 106.0 } }, { { 107.0 } } } } } } }, { { { { { { { { { { 108.0 }, { 109.0 }, { 110.0 } }, { { 111.0 }, { 112.0 } }, { { 113.0 } } } }, { { { 114.0 }, { 115.0 }, { 116.0 } }, { { 117.0 }, { 118.0 } }, { { 119.0 } } } }, { { { 120.0 }, { 121.0 }, { 122.0 } }, { { 123.0 }, { 124.0 } }, { { 125.0 } } } } }, { { { { { { { 126.0 }, { 127.0 }, { 128.0 } }, { { 129.0 }, { 130.0 } }, { { 131.0 } } } }, { { { 132.0 }, { 133.0 }, { 134.0 } }, { { 135.0 }, { 136.0 } }, { { 137.0 } } } }, { { { 138.0 }, { 139.0 }, { 140.0 } }, { { 141.0 }, { 142.0 } }, { { 143.0 } } } } } }, { { { { { { { 144.0 }, { 145.0 }, { 146.0 } }, { { 147.0 }, { 148.0 } }, { { 149.0 } } } }, { { { 150.0 }, { 151.0 }, { 152.0 } }, { { 153.0 }, { 154.0 } }, { { 155.0 } } } }, { { { 156.0 }, { 157.0 }, { 158.0 } }, { { 159.0 }, { 160.0 } }, { { 161.0 } } } }, { { { { { { 162.0 }, { 163.0 }, { 164.0 } }, { { 165.0 }, { 166.0 } }, { { 167.0 } } } }, { { { 168.0 }, { 169.0 }, { 170.0 } }, { { 171.0 }, { 172.0 } }, { { 173.0 } } } }, { { { 174.0 }, { 175.0 }, { 176.0 } }, { { 177.0 }, { 178.0 } }, { { 179.0 } } } }, { { { { { { 180.0 }, { 181.0 }, { 182.0 } }, { { 183.0 }, { 184.0 } }, { { 185.0 } } } }, { { { 186.0 }, { 187.0 }, { 188.0 } }, { { 189.0 }, { 190.0 } }, { { 191.0 } } } }, { { { 192.0 }, { 193.0 }, { 194.0 } }, { { 195.0 }, { 196.0 } }, { { 197.0 } } } } } } } });
    double v2(198.0);
    auto start = std::chrono::high_resolution_clock::now();
    double result;
    for (int i = 0; i < 1000; i ++) {
      result = f0(v0, v1, v2);
    }
    auto end = std::chrono::high_resolution_clock::now();
    double value = *((double*) &result);
    std::cout << value << "\n";
    std::cout << std::chrono::duration_cast<std::chrono::nanoseconds>(end-start).count();
    std::cout << "\n";
    return 0;
  }
