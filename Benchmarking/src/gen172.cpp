  #include <vector>
  #include <iostream>
  #include <chrono>
  struct s0 {
    std::vector<std::vector<double>> p0;
    double p1;
    s0(std::vector<std::vector<double>> v0, double v1): p0(v0), p1(v1) { }
  };
  struct s1 {
    s0 p0;
    s1(s0 v0): p0(v0) { }
  };
  struct s2 {
    s1 p0;
    s1 p1;
    s2(s1 v0, s1 v1): p0(v0), p1(v1) { }
  };
  struct s3 {
    double p0;
    s2 p1;
    s3(double v0, s2 v1): p0(v0), p1(v1) { }
  };
  s2 f110(const s2 &v0) {
    const s1 v1 = v0.p1;
    const s0 v8 = v1.p0;
    s0 v5 = v8;
    s1 v4 = v1;
    s1 v2 = v4;
    s2 v9 = v0;
    s1 v20 = v2;
    v9.p0 = v4;
    const s0 v15 = v1.p0;
    s2 v7 = v0;
    const double v11 = v15.p1;
    const s0 v6 = v4.p0;
    v4.p0 = v15;
    const std::vector<s2> v30 { v0, v9, v9, v7, v9 };
    v7.p0 = v20;
    v4.p0 = v5;
    v5.p1 = v11;
    v4.p0 = v15;
    const s2 v31 = v30[2];
    v7 = v0;
    std::vector<s2> v36 = v30;
    v36[3] = v31;
    std::vector<s2> v63 = v36;
    const s2 v58 = v63[0];
    const s2 v70 = v36[3];
    v36[1] = v58;
    v36[3] = v7;
    v63[0] = v58;
    v36[1] = v0;
    v20.p0 = v6;
    return v70;
  }
  s2 f92(const s2 &v0) {
    const s1 v1 = v0.p0;
    const s2 v9(v1, v1);
    const std::vector<s1> v3 { v1, v1, v1, v1, v1, v1 };
    s2 v8 = v9;
    s1 v7 = v1;
    const s0 v2 = v7.p0;
    const s1 v10 = v0.p1;
    v8.p0 = v7;
    const s2 v11 = f110(v8);
    const s1 v16 = v3[3];
    const s0 v17 = v1.p0;
    const std::vector<std::vector<double>> v15 = v17.p0;
    const s2 v24 = f110(v9);
    const s1 v12 = v3[3];
    v8.p1 = v12;
    const std::vector<double> v4 = v15[1];
    s1 v20 = v10;
    const s1 v14 = v24.p0;
    const s0 v34 = v20.p0;
    const s2 v26 = f110(v24);
    v20.p0 = v2;
    const s0 v48 = v12.p0;
    const s2 v19 = f110(v11);
    s0 v35 = v17;
    const std::vector<double> v36 = v15[2];
    v7.p0 = v35;
    s1 v50 = v12;
    s1 v47 = v50;
    const s1 v55 = v26.p0;
    const s1 v96 = v26.p1;
    const double v151 = v4[0];
    v8.p0 = v10;
    v8.p1 = v96;
    s2 v100 = v19;
    const double v101 = v36[0];
    const s0 v83 = v47.p0;
    v8.p1 = v16;
    v20.p0 = v48;
    v35.p1 = v151;
    v8.p0 = v14;
    v7.p0 = v34;
    v35.p1 = v101;
    v20.p0 = v83;
    const s2 v150 = f110(v100);
    v50.p0 = v2;
    v100.p1 = v55;
    v8 = v19;
    return v150;
  }
  s1 f88(const s1 &v0) {
    return v0;
  }
  s1 f86(const s1 &v0) {
    const s0 v4 = v0.p0;
    const s0 v3 = v0.p0;
    const std::vector<std::vector<double>> v2 = v4.p0;
    const std::vector<double> v7 = v2[0];
    const double v5 = v3.p1;
    const double v6 = v3.p1;
    s0 v1 = v4;
    const std::vector<std::vector<double>> v8 = v3.p0;
    v1.p0 = v8;
    v1.p0 = v2;
    const std::vector<double> v12 = v2[0];
    const std::vector<s0> v14 { v4, v4, v3, v1, v1, v3 };
    const std::vector<double> v9 = v2[0];
    v1.p1 = v6;
    const std::vector<std::vector<double>> v23 { v7, v7, v9, v7, v7, v12 };
    const std::vector<double> v22 = v2[1];
    std::vector<double> v47 = v7;
    v1.p1 = v6;
    v47[0] = v5;
    std::vector<std::vector<double>> v39 = v23;
    v39[2] = v47;
    const s0 v30 = v0.p0;
    const std::vector<double> v24 = v39[5];
    const double v59 = v24[0];
    v47[0] = v5;
    v47[0] = v59;
    v1.p1 = v59;
    const s0 v42 = v14[2];
    const s1 v37 = f88(v0);
    s1 v198 = v37;
    v47[0] = v59;
    v39[0] = v22;
    v198.p0 = v42;
    v47[0] = v6;
    v1.p1 = v5;
    v198.p0 = v30;
    v47[0] = v6;
    return v198;
  }
  s2 f82(const s2 &v0) {
    const s2 v3 = f110(v0);
    const s2 v1 = f92(v3);
    s2 v9 = v1;
    const s1 v11 = v1.p1;
    v9.p0 = v11;
    v9.p0 = v11;
    const s2 v10 = f92(v9);
    const s2 v22 = f92(v10);
    s1 v21 = v11;
    const s1 v20 = f86(v21);
    const s1 v19 = f86(v20);
    const s1 v12 = v22.p0;
    const s1 v28 = f86(v20);
    const s1 v34 = f86(v12);
    const s1 v14 = f86(v11);
    const s1 v32 = f88(v20);
    v9.p1 = v14;
    s2 v75 = v10;
    v75.p0 = v28;
    s1 v44 = v34;
    const s1 v64 = f88(v44);
    const s1 v78 = f86(v12);
    const std::vector<s1> v61 { v78, v19, v12, v32 };
    const s1 v71 = f88(v64);
    std::vector<s1> v159 = v61;
    v159[3] = v14;
    v9.p1 = v71;
    const s1 v104 = v159[3];
    const s2 v126 = f110(v75);
    v159[3] = v28;
    v9.p0 = v104;
    return v126;
  }
  s1 f81(const s1 &v0) {
    s1 v5 = v0;
    const s0 v6 = v5.p0;
    const s1 v9 = f86(v0);
    s1 v48 = v9;
    v48.p0 = v6;
    return v48;
  }
  s2 f73(const s2 &v0) {
    const s2 v1 = f110(v0);
    const s2 v7 = f82(v1);
    s2 v6 = v7;
    s2 v2 = v1;
    const s1 v3 = v7.p1;
    const s2 v9(v3, v3);
    v6.p1 = v3;
    const s1 v29 = f88(v3);
    const std::vector<s2> v8 { v9, v2, v1, v6, v2, v1, v6 };
    std::vector<s2> v21 = v8;
    v21[1] = v7;
    s2 v39 = v0;
    const s2 v17 = v8[5];
    const s2 v30 = f110(v9);
    v21[2] = v30;
    const s1 v41 = v2.p1;
    const s1 v57 = v7.p0;
    v2.p0 = v29;
    v21[1] = v39;
    v21[1] = v2;
    const s2 v104 = f92(v17);
    v39.p1 = v41;
    v39.p0 = v57;
    const s2 v83 = v21[6];
    v39 = v104;
    s2 v165 = v83;
    v21[3] = v165;
    return v165;
  }
  std::vector<s2> f63(const std::vector<s2> &v0, const std::vector<std::vector<s2>> &v1, const s3 &v2) {
    std::vector<std::vector<s2>> v7 = v1;
    const s2 v3 = v0[0];
    const s2 v6 = f82(v3);
    v7[0] = v0;
    const s1 v9 = v6.p1;
    const s1 v12 = v6.p1;
    s2 v11 = v6;
    const s2 v13 = f82(v3);
    const std::vector<s2> v16 = v1[0];
    v11.p1 = v12;
    v11 = v13;
    s1 v19 = v9;
    v7[0] = v16;
    v11.p1 = v19;
    v7[0] = v0;
    const s0 v24 = v9.p0;
    v7[0] = v0;
    v19.p0 = v24;
    std::vector<s2> v42 = v0;
    v7[0] = v42;
    const std::vector<s2> v39 = v7[0];
    v7[0] = v39;
    v42[0] = v11;
    std::vector<s2> v41 = v42;
    v41 = v39;
    v7 = v1;
    v7 = v1;
    v41[0] = v11;
    std::vector<s2> v31 = v41;
    v7[0] = v42;
    std::vector<s2> v97 = v31;
    v42[0] = v11;
    return v97;
  }
  s1 f58(const s1 &v0, const s1 &v1) {
    const s1 v2 = f88(v0);
    const s1 v10 = f86(v2);
    const s2 v3(v2, v1);
    s2 v22 = v3;
    v22.p0 = v10;
    const s1 v24 = v22.p1;
    return v24;
  }
  s2 f38(const s2 &v0) {
    const s1 v2 = v0.p1;
    const s1 v5 = f86(v2);
    const s1 v3 = f81(v5);
    s2 v7 = v0;
    const s1 v10 = f88(v2);
    v7.p0 = v10;
    const s1 v9 = v7.p1;
    s2 v16 = v7;
    v16.p1 = v2;
    const s1 v25 = f81(v2);
    const s1 v63 = f58(v3, v9);
    v16.p0 = v9;
    v16.p0 = v25;
    v16.p1 = v25;
    const s1 v56 = f86(v63);
    v7.p1 = v56;
    return v16;
  }
  __attribute__((noinline))
  double f0(const s3 &v0, const std::vector<s2> &v1, const std::vector<std::vector<s2>> &v2, const double &v3) {
    std::vector<s2> v4 = v1;
    std::vector<s2> v5 = v4;
    const std::vector<s2> v8 = f63(v5, v2, v0);
    const s2 v11 = v0.p1;
    const s1 v13 = v11.p1;
    const s1 v7 = v11.p1;
    const s1 v10 = f88(v7);
    std::vector<s2> v9 = v4;
    const s2 v31 = f73(v11);
    s2 v20 = v11;
    v20.p0 = v13;
    const s2 v15 = v5[0];
    const double v27 = v3 + v3;
    v20.p0 = v10;
    v5 = v8;
    const s2 v29 = v9[0];
    v4[0] = v29;
    const std::vector<s2> v45 { v11 };
    s3 v61 = v0;
    const s1 v39 = v20.p0;
    const s2 v51 = f38(v31);
    const s2 v62(v39, v7);
    v4 = v45;
    v4[0] = v29;
    const double v40 = v61.p0;
    v9[0] = v62;
    const s1 v48 = v15.p1;
    const s0 v37 = v48.p0;
    const double v36 = v37.p1;
    const std::vector<double> v70 { v36, v27, v3, v36, v40, v36, v36 };
    v4[0] = v62;
    const double v160 = v61.p0;
    double v168 = v160;
    const double v252 = v70[5];
    v9[0] = v51;
    const double v129 = v27 + v168;
    const double v138 = v129 * v252;
    return v138;
  }
  int main() {
    s3 v0({ 0.0, { { { { { 1.0 }, { 2.0 }, { 3.0 } }, 4.0 } }, { { { { 5.0 }, { 6.0 }, { 7.0 } }, 8.0 } } } });
    std::vector<s2> v1({ { { { { { 9.0 }, { 10.0 }, { 11.0 } }, 12.0 } }, { { { { 13.0 }, { 14.0 }, { 15.0 } }, 16.0 } } } });
    std::vector<std::vector<s2>> v2({ { { { { { { 17.0 }, { 18.0 }, { 19.0 } }, 20.0 } }, { { { { 21.0 }, { 22.0 }, { 23.0 } }, 24.0 } } } } });
    double v3(25.0);
    auto start = std::chrono::high_resolution_clock::now();
    double result;
    for (int i = 0; i < 1000; i ++) {
      result = f0(v0, v1, v2, v3);
    }
    auto end = std::chrono::high_resolution_clock::now();
    double value = *((double*) &result);
    std::cout << value << "\n";
    std::cout << std::chrono::duration_cast<std::chrono::nanoseconds>(end-start).count();
    std::cout << "\n";
    return 0;
  }
