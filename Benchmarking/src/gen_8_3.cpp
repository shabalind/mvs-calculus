  #include <vector>
  #include <iostream>
  #include <chrono>
  std::vector<std::vector<double>> f108(const std::vector<std::vector<double>> &v0) {
    std::vector<std::vector<double>> v6 = v0;
    std::vector<std::vector<double>> v4 = v0;
    const std::vector<double> v3 = v6[0];
    v6 = v0;
    std::vector<double> v2 = v3;
    const std::vector<double> v5 = v0[1];
    std::vector<double> v7 = v5;
    v6[0] = v2;
    v4[0] = v3;
    const double v1 = v3[0];
    v7[0] = v1;
    const double v12 = v5[0];
    v2 = v3;
    const double v9 = v3[0];
    double v15 = v9;
    v6[0] = v7;
    std::vector<std::vector<double>> v32 = v4;
    v2[0] = v9;
    std::vector<std::vector<double>> v34 = v32;
    const std::vector<double> v13 = v0[1];
    double v11 = v1;
    v32[1] = v13;
    std::vector<double> v42 = v13;
    v34 = v4;
    v32[1] = v13;
    v6[0] = v42;
    v4[1] = v2;
    v42[0] = v15;
    v42[0] = v12;
    v2[0] = v11;
    return v34;
  }
  std::vector<std::vector<double>> f96(const std::vector<std::vector<double>> &v0) {
    const std::vector<double> v2 = v0[0];
    const std::vector<std::vector<double>> v7 = f108(v0);
    std::vector<double> v3 = v2;
    std::vector<double> v11 = v3;
    const std::vector<double> v4 = v7[1];
    v3 = v2;
    std::vector<std::vector<double>> v6 = v0;
    const std::vector<std::vector<double>> v1 = f108(v0);
    const std::vector<std::vector<double>> v9 = f108(v6);
    std::vector<double> v12 = v4;
    std::vector<std::vector<double>> v8 = v1;
    const std::vector<std::vector<double>> v15 = f108(v9);
    const std::vector<std::vector<double>> v17 { v12, v12, v3, v11, v3, v11 };
    std::vector<std::vector<double>> v18 = v8;
    std::vector<double> v28 = v4;
    v6[1] = v2;
    v18 = v7;
    const std::vector<double> v22 = v18[1];
    const double v32 = v22[0];
    const double v44 = v32 + v32;
    std::vector<std::vector<double>> v26 = v17;
    v28[0] = v32;
    const std::vector<double> v78 = v26[5];
    v3[0] = v44;
    const double v121 = v22[0];
    std::vector<std::vector<double>> v114 = v15;
    v114[1] = v78;
    const std::vector<std::vector<double>> v138 = f108(v114);
    v12[0] = v32;
    v18[0] = v28;
    v11[0] = v121;
    const std::vector<std::vector<double>> v133 = f108(v138);
    return v133;
  }
  std::vector<std::vector<double>> f90(const std::vector<std::vector<double>> &v0) {
    const std::vector<double> v6 = v0[0];
    std::vector<std::vector<double>> v1 = v0;
    const std::vector<double> v2 = v0[1];
    v1 = v0;
    const std::vector<std::vector<std::vector<double>>> v5 { v1, v0 };
    v1[1] = v6;
    const std::vector<double> v4 = v0[0];
    std::vector<double> v7 = v6;
    const std::vector<std::vector<double>> v8 = f96(v1);
    v1[1] = v2;
    std::vector<std::vector<double>> v10 = v8;
    v10[1] = v4;
    v10[1] = v7;
    std::vector<std::vector<std::vector<double>>> v17 = v5;
    const std::vector<std::vector<double>> v16 = v17[1];
    std::vector<double> v23 = v7;
    v1[1] = v4;
    v1[1] = v23;
    v10 = v16;
    const double v42 = v6[0];
    v1[0] = v7;
    v7[0] = v42;
    return v10;
  }
  std::vector<std::vector<double>> f78(const std::vector<std::vector<double>> &v0, const double &v1, const std::vector<std::vector<double>> &v2) {
    const std::vector<double> v8 = v0[1];
    double v12 = v1;
    std::vector<std::vector<double>> v3 = v0;
    std::vector<double> v15 = v8;
    std::vector<std::vector<double>> v20 = v3;
    v20[1] = v15;
    const std::vector<double> v21 = v0[0];
    v15[0] = v12;
    const double v26 = v21[0];
    v15[0] = v26;
    v15[0] = v26;
    return v20;
  }
  std::vector<std::vector<double>> f73(const std::vector<std::vector<double>> &v0) {
    const std::vector<std::vector<std::vector<double>>> v1 { v0, v0, v0, v0, v0, v0 };
    const std::vector<double> v6 = v0[0];
    const std::vector<std::vector<double>> v4 = f90(v0);
    const double v5 = v6[0];
    std::vector<std::vector<std::vector<double>>> v3 = v1;
    std::vector<std::vector<double>> v2 = v4;
    std::vector<std::vector<double>> v8 = v4;
    const std::vector<double> v7 = v2[1];
    double v16 = v5;
    const std::vector<std::vector<double>> v9 = f108(v8);
    const double v18 = v7[0];
    const std::vector<std::vector<double>> v12 = f78(v0, v5, v9);
    const std::vector<std::vector<double>> v35 = f90(v12);
    const std::vector<std::vector<double>> v20 = f78(v9, v16, v9);
    const std::vector<double> v29 = v0[0];
    const std::vector<double> v45 = v20[0];
    const std::vector<std::vector<double>> v24 = v3[2];
    const double v34 = v18 * v18;
    const std::vector<double> v50 = v20[1];
    v8[1] = v50;
    std::vector<std::vector<double>> v39 = v24;
    const std::vector<std::vector<double>> v26 = f90(v35);
    v3[3] = v26;
    const std::vector<std::vector<double>> v27 = f90(v12);
    v39[0] = v29;
    v8[0] = v45;
    const std::vector<std::vector<double>> v52 = f108(v39);
    v2[0] = v29;
    const std::vector<std::vector<double>> v62 = f78(v39, v34, v20);
    const std::vector<std::vector<double>> v61 = f96(v62);
    const std::vector<double> v98 = v61[0];
    const std::vector<std::vector<std::vector<double>>> v42 { v52 };
    const std::vector<std::vector<double>> v89 = f90(v27);
    std::vector<std::vector<std::vector<double>>> v48 = v3;
    v39[1] = v7;
    std::vector<std::vector<std::vector<double>>> v162 = v42;
    std::vector<double> v54 = v98;
    v8[0] = v54;
    v3 = v48;
    std::vector<std::vector<std::vector<double>>> v38 = v162;
    std::vector<double> v84 = v7;
    const std::vector<std::vector<double>> v164 = v38[0];
    std::vector<std::vector<double>> v212 = v164;
    v38[0] = v212;
    std::vector<std::vector<std::vector<double>>> v85 = v42;
    v54 = v84;
    v3[0] = v89;
    std::vector<std::vector<std::vector<double>>> v123 = v38;
    const std::vector<std::vector<std::vector<std::vector<double>>>> v95 { v38, v85, v162, v42, v85, v85, v123 };
    const std::vector<std::vector<std::vector<double>>> v152 = v95[6];
    const std::vector<std::vector<double>> v334 = v152[0];
    return v334;
  }
  __attribute__((noinline))
  double f0(const std::vector<std::vector<double>> &v0, const double &v1) {
    const std::vector<std::vector<double>> v5 = f73(v0);
    const std::vector<double> v6 = v5[0];
    const std::vector<double> v2 = v5[1];
    const std::vector<std::vector<double>> v7 { v6, v2, v6 };
    double v11 = v1;
    const std::vector<double> v8 = v7[2];
    const std::vector<double> v10 = v0[0];
    const double v64 = v8[0];
    const double v150 = v10[0];
    const std::vector<double> v114 { v64, v150, v1, v11 };
    std::vector<double> v223 = v114;
    const double v235 = v223[0];
    return v235;
  }
  int main() {
    std::vector<std::vector<double>> v0({ { 0.0 }, { 1.0 } });
    double v1(2.0);
    auto start = std::chrono::high_resolution_clock::now();
    double result;
    for (int i = 0; i < 1000; i ++) {
      result = f0(v0, v1);
    }
    auto end = std::chrono::high_resolution_clock::now();
    double value = *((double*) &result);
    std::cout << value << "\n";
    std::cout << std::chrono::duration_cast<std::chrono::nanoseconds>(end-start).count();
    std::cout << "\n";
    return 0;
  }
