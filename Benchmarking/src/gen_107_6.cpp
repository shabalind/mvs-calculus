  #include <vector>
  #include <iostream>
  #include <chrono>
  struct s0 {
    std::vector<double> p0;
    std::vector<std::vector<double>> p1;
    s0(std::vector<double> v0, std::vector<std::vector<double>> v1): p0(v0), p1(v1) { }
  };
  struct s1 {
    s0 p0;
    s0 p1;
    s1(s0 v0, s0 v1): p0(v0), p1(v1) { }
  };
  struct s2 {
    s0 p0;
    std::vector<s0> p1;
    s2(s0 v0, std::vector<s0> v1): p0(v0), p1(v1) { }
  };
  struct s3 {
    s1 p0;
    s0 p1;
    s3(s1 v0, s0 v1): p0(v0), p1(v1) { }
  };
  struct s6 {
    s3 p0;
    s2 p1;
    s0 p2;
    s6(s3 v0, s2 v1, s0 v2): p0(v0), p1(v1), p2(v2) { }
  };
  __attribute__((noinline))
  double f0(const s6 &v0, const s1 &v1, const double &v2) {
    const s0 v3 = v0.p2;
    s0 v5 = v3;
    double v12 = v2;
    const std::vector<double> v7 = v5.p0;
    const s0 v10 = v1.p0;
    const double v14 = v7[0];
    const std::vector<std::vector<double>> v34 { v7, v7, v7, v7, v7 };
    const s0 v19 = v1.p0;
    const std::vector<double> v13 = v34[3];
    const double v23 = v2 / v14;
    const std::vector<std::vector<double>> v27 = v19.p1;
    std::vector<double> v65 = v13;
    v65[2] = v2;
    const double v21 = v65[0];
    const std::vector<std::vector<double>> v24 = v19.p1;
    v65[1] = v21;
    const std::vector<double> v38 = v24[2];
    const std::vector<std::vector<double>> v46 = v10.p1;
    std::vector<std::vector<double>> v37 = v46;
    v37[0] = v38;
    v5.p0 = v65;
    const std::vector<double> v80 = v34[3];
    v12 = v23;
    v5.p0 = v80;
    double v55 = v21;
    std::vector<std::vector<double>> v77 = v27;
    const std::vector<double> v92 = v34[3];
    v5.p0 = v92;
    const double v195 = v92[0];
    v65[2] = v195;
    v65[1] = v12;
    v5.p1 = v77;
    v5.p1 = v37;
    return v55;
  }
  int main() {
    s6 v0({ { { { { 0.0, 1.0, 2.0 }, { { 3.0 }, { 4.0 }, { 5.0 } } }, { { 6.0, 7.0, 8.0 }, { { 9.0 }, { 10.0 }, { 11.0 } } } }, { { 12.0, 13.0, 14.0 }, { { 15.0 }, { 16.0 }, { 17.0 } } } }, { { { 18.0, 19.0, 20.0 }, { { 21.0 }, { 22.0 }, { 23.0 } } }, { { { 24.0, 25.0, 26.0 }, { { 27.0 }, { 28.0 }, { 29.0 } } }, { { 30.0, 31.0, 32.0 }, { { 33.0 }, { 34.0 }, { 35.0 } } }, { { 36.0, 37.0, 38.0 }, { { 39.0 }, { 40.0 }, { 41.0 } } } } }, { { 42.0, 43.0, 44.0 }, { { 45.0 }, { 46.0 }, { 47.0 } } } });
    s1 v1({ { { 48.0, 49.0, 50.0 }, { { 51.0 }, { 52.0 }, { 53.0 } } }, { { 54.0, 55.0, 56.0 }, { { 57.0 }, { 58.0 }, { 59.0 } } } });
    double v2(60.0);
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
