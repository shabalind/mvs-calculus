  #include <vector>
  #include <iostream>
  #include <chrono>
  std::vector<std::vector<double>> f51(const std::vector<double> &v0, const std::vector<std::vector<double>> &v1) {
    std::vector<std::vector<double>> v3 = v1;
    const std::vector<double> v9 = v1[0];
    v3[1] = v9;
    return v3;
  }
  std::vector<std::vector<double>> f47(const std::vector<std::vector<double>> &v0) {
    std::vector<std::vector<double>> v3 = v0;
    const std::vector<double> v6 = v3[0];
    std::vector<std::vector<double>> v1 = v3;
    std::vector<std::vector<double>> v4 = v1;
    std::vector<std::vector<double>> v8 = v0;
    std::vector<double> v5 = v6;
    v1[0] = v5;
    const std::vector<double> v27 = v1[2];
    std::vector<std::vector<double>> v20 = v8;
    std::vector<std::vector<double>> v2 = v4;
    const std::vector<double> v32 = v4[1];
    std::vector<double> v28 = v27;
    v3[0] = v32;
    v3[2] = v32;
    const std::vector<double> v81 = v2[1];
    v5 = v28;
    const std::vector<std::vector<std::vector<double>>> v74 { v8, v1, v20 };
    v3[0] = v81;
    std::vector<std::vector<std::vector<double>>> v78 = v74;
    const std::vector<std::vector<double>> v98 = v78[1];
    return v98;
  }
  std::vector<std::vector<double>> f44(const std::vector<std::vector<double>> &v0) {
    std::vector<std::vector<double>> v6 = v0;
    const std::vector<double> v7 = v0[1];
    const std::vector<std::vector<double>> v1 = f47(v6);
    std::vector<double> v4 = v7;
    std::vector<std::vector<double>> v9 = v6;
    v6[1] = v7;
    const std::vector<std::vector<double>> v17 = f47(v0);
    std::vector<std::vector<double>> v12 = v17;
    const std::vector<std::vector<double>> v13 = f47(v0);
    const std::vector<double> v10 = v1[2];
    const std::vector<std::vector<double>> v16 = f47(v0);
    v9[1] = v4;
    const std::vector<std::vector<double>> v11 = f47(v9);
    v12[2] = v10;
    const std::vector<double> v26 = v13[2];
    v9[2] = v26;
    const std::vector<std::vector<double>> v64 = f47(v16);
    const std::vector<std::vector<std::vector<double>>> v56 { v11, v1, v6, v16, v13, v1, v12 };
    std::vector<std::vector<std::vector<double>>> v38 = v56;
    v38[4] = v64;
    std::vector<std::vector<std::vector<double>>> v142 = v38;
    const std::vector<std::vector<double>> v139 = v142[1];
    v142[3] = v139;
    return v139;
  }
  std::vector<std::vector<double>> f43(const std::vector<std::vector<double>> &v0) {
    const std::vector<double> v4 = v0[0];
    const std::vector<std::vector<double>> v8 = f44(v0);
    const std::vector<double> v5 = v8[1];
    std::vector<std::vector<double>> v12 = v8;
    const std::vector<double> v27 = v12[1];
    std::vector<std::vector<double>> v14 = v8;
    const double v24 = v4[0];
    const std::vector<std::vector<double>> v25 = f47(v8);
    const std::vector<std::vector<double>> v36 = f44(v25);
    const std::vector<double> v41 = v36[2];
    double v30 = v24;
    double v64 = v30;
    v14[1] = v41;
    std::vector<double> v97 = v27;
    double v70 = v64;
    v14[0] = v4;
    v97[0] = v70;
    const std::vector<double> v194 = v14[2];
    std::vector<double> v85 = v194;
    v12[0] = v5;
    const std::vector<std::vector<double>> v140 { v27, v97, v85 };
    v97[0] = v30;
    const std::vector<std::vector<double>> v102 = f44(v140);
    return v102;
  }
  double f42(const double &v0) {
    double v1 = v0;
    double v6 = v1;
    v6 = v0;
    const std::vector<double> v8 { v6 };
    const std::vector<std::vector<double>> v19 { v8, v8, v8, v8 };
    std::vector<std::vector<double>> v15 = v19;
    const std::vector<std::vector<std::vector<double>>> v18 { v15, v15, v15, v15, v19, v15 };
    const std::vector<std::vector<double>> v11 = v18[4];
    const std::vector<double> v20 = v15[3];
    const std::vector<double> v13 = v11[3];
    v15[1] = v13;
    const std::vector<std::vector<double>> v29 { v13, v8, v8, v13, v20 };
    std::vector<std::vector<double>> v53 = v29;
    const std::vector<double> v37 = v53[0];
    v15[2] = v8;
    std::vector<double> v42 = v37;
    v15[3] = v20;
    std::vector<double> v40 = v13;
    v53[2] = v8;
    const std::vector<std::vector<std::vector<double>>> v67 { v29, v53, v53, v29, v53 };
    const std::vector<std::vector<double>> v44 = v67[2];
    std::vector<std::vector<std::vector<double>>> v38 = v67;
    v15[1] = v42;
    std::vector<std::vector<double>> v90 = v53;
    const std::vector<std::vector<double>> v70 = v38[2];
    const std::vector<double> v92 = v53[4];
    const std::vector<std::vector<std::vector<double>>> v78 { v44, v70, v29 };
    v90[3] = v92;
    std::vector<std::vector<std::vector<double>>> v132 = v78;
    const std::vector<std::vector<double>> v59 = v132[2];
    v53[0] = v40;
    v53[4] = v13;
    v132[1] = v90;
    v15[1] = v92;
    std::vector<std::vector<double>> v58 = v59;
    v53[3] = v20;
    const std::vector<std::vector<double>> v155 = v78[2];
    const std::vector<double> v134 = v58[0];
    v132[2] = v58;
    v132[2] = v29;
    v38[2] = v58;
    const double v140 = v134[0];
    v132[0] = v155;
    return v140;
  }
  std::vector<std::vector<double>> f38(const std::vector<std::vector<double>> &v0) {
    const std::vector<std::vector<double>> v5 = f47(v0);
    const std::vector<std::vector<double>> v9 = f43(v5);
    const std::vector<double> v15 = v0[2];
    const std::vector<std::vector<double>> v17 = f44(v9);
    const double v18 = v15[0];
    double v29 = v18;
    const std::vector<double> v19 { v29, v18 };
    const double v26 = v19[1];
    const std::vector<double> v57 { v26, v18, v29 };
    const std::vector<std::vector<double>> v39 = f51(v57, v17);
    return v39;
  }
  std::vector<std::vector<double>> f26(const std::vector<std::vector<double>> &v0) {
    const std::vector<double> v7 = v0[2];
    const double v6 = v7[0];
    const std::vector<std::vector<double>> v1 = f38(v0);
    const std::vector<std::vector<double>> v15 = f38(v0);
    const double v4 = v7[0];
    std::vector<std::vector<double>> v11 = v0;
    const std::vector<double> v9 = v1[1];
    v11 = v0;
    v11 = v1;
    const std::vector<double> v20 = v15[0];
    const std::vector<std::vector<double>> v14 = f43(v0);
    const std::vector<std::vector<double>> v12 = f47(v1);
    const std::vector<std::vector<double>> v17 = f43(v12);
    const std::vector<double> v25 = v12[2];
    std::vector<double> v13 = v25;
    const std::vector<double> v22 = v12[0];
    const std::vector<double> v30 = v14[1];
    double v24 = v6;
    std::vector<double> v38 = v9;
    v38[0] = v4;
    const std::vector<std::vector<double>> v67 { v38, v20, v22, v20, v13 };
    std::vector<double> v36 = v38;
    v11[2] = v36;
    const std::vector<double> v111 = v67[0];
    v24 = v4;
    std::vector<std::vector<double>> v200 = v17;
    std::vector<double> v92 = v111;
    const std::vector<std::vector<double>> v40 = f38(v11);
    v92[0] = v24;
    const std::vector<double> v116 = v12[0];
    std::vector<double> v66 = v30;
    std::vector<std::vector<double>> v57 = v40;
    v92 = v66;
    std::vector<std::vector<double>> v120 = v57;
    std::vector<std::vector<double>> v112 = v120;
    v120[0] = v92;
    v57[0] = v116;
    v112 = v200;
    v11[1] = v30;
    return v112;
  }
  __attribute__((noinline))
  double f0(const std::vector<std::vector<double>> &v0, const std::vector<std::vector<double>> &v1, const double &v2) {
    const std::vector<double> v5 = v1[1];
    std::vector<double> v7 = v5;
    const std::vector<double> v9 { v2 };
    const std::vector<std::vector<double>> v10 = f26(v0);
    const std::vector<double> v16 = v0[1];
    const std::vector<double> v36 = v10[1];
    const double v31 = v36[0];
    const std::vector<double> v15 = v1[2];
    v7[0] = v2;
    const std::vector<double> v49 = v1[1];
    std::vector<double> v20 = v16;
    v7[0] = v31;
    const double v52 = v9[0];
    const double v34 = v49[0];
    std::vector<double> v19 = v15;
    v20[0] = v52;
    std::vector<double> v38 = v7;
    const double v26 = f42(v34);
    v20 = v5;
    v38[0] = v31;
    v38[0] = v26;
    v7[0] = v34;
    const double v40 = v19[0];
    v38[0] = v40;
    v38 = v20;
    const double v140 = v38[0];
    return v140;
  }
  int main() {
    std::vector<std::vector<double>> v0({ { 0.0 }, { 1.0 }, { 2.0 } });
    std::vector<std::vector<double>> v1({ { 3.0 }, { 4.0 }, { 5.0 } });
    double v2(6.0);
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
