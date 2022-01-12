  #include <vector>
  #include <iostream>
  #include <chrono>
  struct s0 {
    std::vector<std::vector<double>> p0;
    std::vector<std::vector<double>> p1;
    s0(std::vector<std::vector<double>> v0, std::vector<std::vector<double>> v1): p0(v0), p1(v1) { }
  };
  struct s1 {
    std::vector<s0> p0;
    s0 p1;
    s1(std::vector<s0> v0, s0 v1): p0(v0), p1(v1) { }
  };
  struct s3 {
    std::vector<s0> p0;
    s1 p1;
    s3(std::vector<s0> v0, s1 v1): p0(v0), p1(v1) { }
  };
  std::vector<double> f16(const std::vector<double> &v0) {
    const double v5 = v0[0];
    const double v4 = v0[0];
    double v6 = v5;
    const double v11 = v0[0];
    v6 = v11;
    std::vector<double> v9 = v0;
    const double v2 = v9[0];
    const double v10 = v0[0];
    v9[0] = v6;
    std::vector<double> v18 = v0;
    const double v12 = v9[0];
    std::vector<double> v13 = v18;
    std::vector<double> v17 = v18;
    const double v16 = v17[0];
    const double v23 = v18[0];
    double v43 = v12;
    std::vector<double> v28 = v13;
    const double v38 = v17[0];
    const double v26 = v2 - v6;
    v18[0] = v4;
    v9[0] = v26;
    const double v37 = v17[0];
    std::vector<double> v34 = v17;
    const double v30 = v28[0];
    v17[0] = v6;
    v13[0] = v38;
    v9[0] = v30;
    v17[0] = v43;
    std::vector<double> v82 = v9;
    double v31 = v10;
    v28[0] = v37;
    v18[0] = v23;
    v82[0] = v16;
    v9[0] = v23;
    const double v68 = v82[0];
    std::vector<double> v77 = v34;
    v13[0] = v31;
    double v84 = v6;
    std::vector<double> v69 = v77;
    v34[0] = v26;
    v18[0] = v6;
    v9[0] = v68;
    v18[0] = v68;
    v34[0] = v84;
    return v69;
  }
  __attribute__((noinline))
  double f0(const s1 &v0, const std::vector<std::vector<s3>> &v1, const double &v2) {
    s1 v5 = v0;
    const std::vector<s0> v10 = v5.p0;
    const s0 v7 = v10[0];
    v5.p1 = v7;
    v5.p0 = v10;
    const std::vector<std::vector<double>> v28 = v7.p0;
    std::vector<std::vector<double>> v26 = v28;
    const std::vector<double> v38 = v26[0];
    std::vector<double> v46 = v38;
    const std::vector<double> v32 = f16(v46);
    double v77 = v2;
    v26[0] = v32;
    const double v138 = v38[0];
    v46 = v38;
    const double v63 = v138 + v138;
    v26[0] = v38;
    const double v136 = v77 * v63;
    return v136;
  }
  int main() {
    s1 v0({ { { { { 0.0 } }, { { 1.0 }, { 2.0 }, { 3.0 } } }, { { { 4.0 } }, { { 5.0 }, { 6.0 }, { 7.0 } } }, { { { 8.0 } }, { { 9.0 }, { 10.0 }, { 11.0 } } } }, { { { 12.0 } }, { { 13.0 }, { 14.0 }, { 15.0 } } } });
    std::vector<std::vector<s3>> v1({ { { { { { { 16.0 } }, { { 17.0 }, { 18.0 }, { 19.0 } } } }, { { { { { 20.0 } }, { { 21.0 }, { 22.0 }, { 23.0 } } }, { { { 24.0 } }, { { 25.0 }, { 26.0 }, { 27.0 } } }, { { { 28.0 } }, { { 29.0 }, { 30.0 }, { 31.0 } } } }, { { { 32.0 } }, { { 33.0 }, { 34.0 }, { 35.0 } } } } } } });
    double v2(36.0);
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
