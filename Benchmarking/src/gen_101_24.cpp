  #include <vector>
  #include <iostream>
  #include <chrono>
  struct s0 {
    std::vector<std::vector<double>> p0;
    std::vector<std::vector<double>> p1;
    s0(std::vector<std::vector<double>> v0, std::vector<std::vector<double>> v1): p0(v0), p1(v1) { }
  };
  struct s1 {
    s0 p0;
    s0 p1;
    s1(s0 v0, s0 v1): p0(v0), p1(v1) { }
  };
  struct s2 {
    s0 p0;
    s1 p1;
    s2(s0 v0, s1 v1): p0(v0), p1(v1) { }
  };
  double f95(const double &v0) {
    double v7 = v0;
    double v9 = v0;
    double v1 = v0;
    double v6 = v0;
    double v3 = v7;
    double v2 = v1;
    double v13 = v2;
    const std::vector<double> v15 { v0, v13, v9, v7, v0, v6, v9 };
    std::vector<double> v21 = v15;
    const double v17 = v21[1];
    v21[4] = v2;
    double v12 = v3;
    const double v45 = v15[0];
    double v19 = v17;
    v21[2] = v45;
    v21[3] = v1;
    std::vector<double> v24 = v15;
    const double v35 = v24[3];
    const double v50 = v24[5];
    v24[3] = v45;
    const std::vector<double> v60 { v12 };
    v24[6] = v50;
    std::vector<double> v70 = v60;
    v24[2] = v19;
    v70 = v60;
    v70[0] = v35;
    v70[0] = v3;
    const double v53 = v70[0];
    v70[0] = v45;
    return v53;
  }
  double f46(const double &v0) {
    double v7 = v0;
    double v2 = v7;
    double v1 = v0;
    double v6 = v1;
    const double v3 = f95(v0);
    double v8 = v3;
    double v5 = v0;
    double v9 = v8;
    const double v12 = f95(v6);
    const double v20 = f95(v1);
    double v10 = v2;
    const std::vector<double> v18 { v1, v3, v8, v7, v5 };
    const double v15 = v18[4];
    const double v28 = f95(v15);
    double v24 = v12;
    std::vector<double> v22 = v18;
    const double v16 = f95(v10);
    v22[2] = v24;
    const double v17 = f95(v20);
    const double v37 = v22[0];
    v22[0] = v7;
    const double v19 = v18[0];
    v22[4] = v19;
    v2 = v0;
    v22[3] = v16;
    const double v33 = f95(v28);
    const double v31 = v18[3];
    v22[3] = v37;
    v22[4] = v17;
    const double v43 = v18[2];
    const double v59 = v22[0];
    v7 = v17;
    const double v57 = v18[4];
    const double v102 = v18[2];
    std::vector<double> v50 = v18;
    const double v143 = f95(v59);
    const double v83 = f95(v143);
    v22[4] = v7;
    v22[3] = v83;
    const double v97 = f95(v102);
    v50[1] = v33;
    v10 = v143;
    v22[3] = v43;
    v2 = v97;
    v50[0] = v59;
    v50[3] = v31;
    const double v150 = v50[0];
    const double v158 = f95(v57);
    const double v175 = v158 - v150;
    v22[2] = v9;
    return v175;
  }
  double f29(const double &v0) {
    const double v5 = f46(v0);
    double v2 = v0;
    const double v7 = f46(v5);
    double v3 = v0;
    double v10 = v7;
    const double v19 = f95(v2);
    const double v26 = f46(v2);
    const double v16 = f46(v19);
    const double v28 = v3 * v19;
    double v23 = v3;
    v3 = v5;
    double v32 = v26;
    const std::vector<double> v46 { v28, v23, v16, v32, v10 };
    const double v80 = v46[3];
    const double v117 = f95(v80);
    return v117;
  }
  __attribute__((noinline))
  double f0(const std::vector<std::vector<s2>> &v0, const double &v1) {
    std::vector<std::vector<s2>> v10 = v0;
    double v5 = v1;
    const double v8 = f29(v5);
    std::vector<std::vector<s2>> v18 = v10;
    v10 = v0;
    const std::vector<s2> v3 = v18[1];
    const s2 v14 = v3[0];
    const s0 v12 = v14.p0;
    s0 v16 = v12;
    v18[1] = v3;
    const std::vector<std::vector<double>> v36 = v16.p1;
    v18[1] = v3;
    std::vector<std::vector<double>> v26 = v36;
    const std::vector<std::vector<double>> v20 = v12.p1;
    const std::vector<double> v22 = v26[0];
    std::vector<double> v56 = v22;
    v18[0] = v3;
    const double v54 = f29(v8);
    const std::vector<std::vector<double>> v35 = v12.p1;
    v56[0] = v54;
    v16.p1 = v20;
    const std::vector<s2> v77 = v0[1];
    v18[0] = v77;
    const double v64 = v56[0];
    v16.p1 = v35;
    return v64;
  }
  int main() {
    std::vector<std::vector<s2>> v0({ { { { { { 0.0 }, { 1.0 }, { 2.0 } }, { { 3.0 } } }, { { { { 4.0 }, { 5.0 }, { 6.0 } }, { { 7.0 } } }, { { { 8.0 }, { 9.0 }, { 10.0 } }, { { 11.0 } } } } } }, { { { { { 12.0 }, { 13.0 }, { 14.0 } }, { { 15.0 } } }, { { { { 16.0 }, { 17.0 }, { 18.0 } }, { { 19.0 } } }, { { { 20.0 }, { 21.0 }, { 22.0 } }, { { 23.0 } } } } } } });
    double v1(24.0);
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
