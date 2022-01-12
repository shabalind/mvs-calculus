  #include <vector>
  #include <iostream>
  #include <chrono>
  struct s0 {
    std::vector<std::vector<double>> p0;
    std::vector<std::vector<double>> p1;
    s0(std::vector<std::vector<double>> v0, std::vector<std::vector<double>> v1): p0(v0), p1(v1) { }
  };
  std::vector<std::vector<double>> f11(const std::vector<std::vector<double>> &v0) {
    const std::vector<std::vector<std::vector<double>>> v7 { v0, v0, v0, v0, v0 };
    const std::vector<std::vector<double>> v1 = v7[2];
    const std::vector<double> v5 = v0[1];
    const double v4 = v5[0];
    const std::vector<double> v8 = v1[0];
    const std::vector<std::vector<double>> v6 = v7[2];
    std::vector<std::vector<double>> v3 = v0;
    v3[1] = v8;
    std::vector<std::vector<std::vector<double>>> v20 = v7;
    std::vector<std::vector<double>> v15 = v1;
    v3[0] = v8;
    double v13 = v4;
    std::vector<std::vector<double>> v10 = v3;
    const std::vector<std::vector<double>> v18 = v20[0];
    const std::vector<double> v29 = v15[1];
    std::vector<double> v23 = v8;
    std::vector<double> v24 = v29;
    v20[3] = v1;
    v20[3] = v18;
    v3[0] = v23;
    v20[1] = v18;
    v15[0] = v24;
    v15[1] = v29;
    v24[0] = v13;
    const std::vector<std::vector<double>> v25 = v20[0];
    const std::vector<double> v43 = v25[0];
    v3[1] = v23;
    v3[1] = v43;
    const std::vector<std::vector<double>> v64 { v23, v43, v5 };
    v3[0] = v24;
    std::vector<std::vector<double>> v59 = v0;
    std::vector<std::vector<double>> v39 = v64;
    std::vector<std::vector<double>> v136 = v64;
    double v47 = v4;
    v10[1] = v5;
    const s0 v88(v39, v6);
    s0 v61 = v88;
    const std::vector<std::vector<double>> v105 = v61.p0;
    v61.p0 = v136;
    v136[0] = v23;
    const std::vector<std::vector<double>> v110 = v61.p0;
    v24[0] = v47;
    const s0 v96(v110, v10);
    const std::vector<double> v98 = v59[1];
    v136[1] = v29;
    v61.p0 = v105;
    v61.p0 = v136;
    v39[2] = v5;
    const std::vector<std::vector<double>> v58 = v88.p0;
    std::vector<std::vector<double>> v86 = v136;
    v61.p0 = v39;
    const std::vector<std::vector<std::vector<double>>> v171 { v58 };
    v61.p0 = v39;
    v39 = v136;
    const std::vector<double> v135 = v59[1];
    const std::vector<std::vector<double>> v196 = v171[0];
    v61.p0 = v86;
    v59[0] = v98;
    v61.p0 = v196;
    const std::vector<std::vector<double>> v152 = v96.p1;
    v39[1] = v135;
    return v152;
  }
  s0 f10(const s0 &v0) {
    const std::vector<std::vector<double>> v3 = v0.p1;
    const std::vector<std::vector<double>> v7 = v0.p0;
    const s0 v9(v7, v3);
    return v9;
  }
  __attribute__((noinline))
  double f0(const std::vector<std::vector<s0>> &v0, const double &v1) {
    std::vector<std::vector<s0>> v5 = v0;
    const std::vector<s0> v7 = v5[2];
    const s0 v4 = v7[0];
    const std::vector<std::vector<double>> v3 = v4.p1;
    const s0 v11 = f10(v4);
    const std::vector<s0> v10 = v0[0];
    const std::vector<std::vector<double>> v12 = f11(v3);
    const std::vector<std::vector<double>> v24 = v11.p0;
    const std::vector<std::vector<double>> v19 = f11(v12);
    const std::vector<double> v21 = v24[0];
    std::vector<std::vector<double>> v31 = v12;
    v5[1] = v10;
    const std::vector<std::vector<double>> v14 = f11(v31);
    const std::vector<double> v50 = v19[1];
    v31[1] = v50;
    const std::vector<double> v27 = v14[0];
    v31[0] = v27;
    v31[0] = v21;
    v31[1] = v50;
    const double v175 = v27[0];
    return v175;
  }
  int main() {
    std::vector<std::vector<s0>> v0({ { { { { 0.0 }, { 1.0 }, { 2.0 } }, { { 3.0 }, { 4.0 } } } }, { { { { 5.0 }, { 6.0 }, { 7.0 } }, { { 8.0 }, { 9.0 } } } }, { { { { 10.0 }, { 11.0 }, { 12.0 } }, { { 13.0 }, { 14.0 } } } } });
    double v1(15.0);
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
