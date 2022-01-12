  #include <vector>
  #include <iostream>
  #include <chrono>
  struct s0 {
    std::vector<std::vector<double>> p0;
    std::vector<std::vector<double>> p1;
    s0(std::vector<std::vector<double>> v0, std::vector<std::vector<double>> v1): p0(v0), p1(v1) { }
  };
  s0 f11(const s0 &v0, const s0 &v1) {
    const std::vector<s0> v3 { v1, v0, v1, v0, v1, v1, v0 };
    s0 v2 = v0;
    std::vector<s0> v5 = v3;
    v5[5] = v1;
    const std::vector<std::vector<double>> v6 = v0.p0;
    const std::vector<std::vector<std::vector<double>>> v15 { v6, v6, v6, v6 };
    const std::vector<std::vector<double>> v11 = v15[0];
    const s0 v7 = v5[1];
    std::vector<std::vector<double>> v10 = v6;
    const std::vector<std::vector<double>> v12 = v1.p0;
    const std::vector<std::vector<double>> v8 = v7.p0;
    v2.p0 = v12;
    std::vector<std::vector<double>> v9 = v8;
    std::vector<std::vector<double>> v25 = v9;
    const std::vector<std::vector<double>> v14 = v7.p1;
    const std::vector<double> v20 = v14[0];
    v2.p1 = v14;
    const s0 v19 = v5[3];
    v5[6] = v7;
    const std::vector<std::vector<double>> v47 = v15[1];
    const std::vector<double> v17 = v25[2];
    const double v37 = v17[0];
    const s0 v22(v10, v14);
    v25 = v11;
    v2.p0 = v47;
    const std::vector<double> v35 = v14[0];
    std::vector<double> v64 = v17;
    v64[0] = v37;
    const std::vector<std::vector<double>> v34 = v22.p0;
    v2 = v0;
    const std::vector<std::vector<double>> v41 = v15[3];
    const std::vector<std::vector<double>> v44 = v19.p1;
    v25[2] = v35;
    v2.p0 = v10;
    v5[5] = v2;
    v2.p1 = v14;
    const std::vector<std::vector<double>> v69 = v7.p0;
    const std::vector<double> v61 = v69[0];
    const std::vector<std::vector<double>> v117 = v2.p1;
    v10[0] = v61;
    v5[5] = v2;
    v2.p1 = v117;
    v10[0] = v64;
    v2.p0 = v41;
    const std::vector<std::vector<double>> v145 = v7.p0;
    v2.p0 = v145;
    v10 = v8;
    const s0 v167(v34, v44);
    v25[0] = v20;
    return v167;
  }
  __attribute__((noinline))
  double f0(const s0 &v0, const s0 &v1, const s0 &v2, const double &v3) {
    const s0 v9 = f11(v1, v2);
    const std::vector<std::vector<double>> v4 = v9.p1;
    double v5 = v3;
    const std::vector<double> v11 = v4[0];
    std::vector<double> v27 = v11;
    const double v15 = v27[0];
    v27[0] = v5;
    return v15;
  }
  int main() {
    s0 v0({ { { 0.0 }, { 1.0 }, { 2.0 } }, { { 3.0 } } });
    s0 v1({ { { 4.0 }, { 5.0 }, { 6.0 } }, { { 7.0 } } });
    s0 v2({ { { 8.0 }, { 9.0 }, { 10.0 } }, { { 11.0 } } });
    double v3(12.0);
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
