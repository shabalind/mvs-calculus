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
    std::vector<std::vector<s0>> p1;
    std::vector<std::vector<s0>> p2;
    s0 p3;
    s1(std::vector<s0> v0, std::vector<std::vector<s0>> v1, std::vector<std::vector<s0>> v2, s0 v3): p0(v0), p1(v1), p2(v2), p3(v3) { }
  };
  struct s3 {
    std::vector<std::vector<double>> p0;
    s1 p1;
    s3(std::vector<std::vector<double>> v0, s1 v1): p0(v0), p1(v1) { }
  };
  struct s6 {
    std::vector<s3> p0;
    s0 p1;
    s6(std::vector<s3> v0, s0 v1): p0(v0), p1(v1) { }
  };
  double f41(const double &v0, const s6 &v1) {
    s6 v4 = v1;
    const std::vector<s3> v6 = v4.p0;
    s6 v3 = v1;
    v4 = v3;
    const s0 v2 = v1.p1;
    const s3 v9 = v6[0];
    const std::vector<std::vector<double>> v11 = v9.p0;
    const std::vector<double> v37 = v11[1];
    v4.p0 = v6;
    const s6 v16(v6, v2);
    v3.p1 = v2;
    const double v19 = v37[0];
    v3.p1 = v2;
    v4.p0 = v6;
    v4.p0 = v6;
    const std::vector<s3> v38 = v16.p0;
    v3.p1 = v2;
    v4.p0 = v6;
    v3.p0 = v6;
    v3.p1 = v2;
    v4.p0 = v38;
    return v19;
  }
  __attribute__((noinline))
  double f0(const s3 &v0, const s6 &v1, const double &v2) {
    s6 v7 = v1;
    s6 v6 = v1;
    const std::vector<s3> v9 = v6.p0;
    const s3 v8 = v9[0];
    v7.p0 = v9;
    const s3 v12 = v9[2];
    v6.p0 = v9;
    const s1 v19 = v12.p1;
    const double v17 = f41(v2, v7);
    v7.p0 = v9;
    v6.p0 = v9;
    const std::vector<s0> v30 = v19.p0;
    const s0 v21 = v30[0];
    v6.p0 = v9;
    const std::vector<std::vector<double>> v26 = v8.p0;
    v6.p0 = v9;
    v6.p1 = v21;
    v6.p0 = v9;
    const std::vector<double> v59 = v26[1];
    const double v85 = v59[0];
    v6.p0 = v9;
    const double v80 = v17 / v85;
    v6.p0 = v9;
    double v253 = v80;
    return v253;
  }
  int main() {
    s3 v0({ { { 0.0 }, { 1.0 } }, { { { { { 2.0 } }, { { 3.0 }, { 4.0 }, { 5.0 } } } }, { { { { { 6.0 } }, { { 7.0 }, { 8.0 }, { 9.0 } } } }, { { { { 10.0 } }, { { 11.0 }, { 12.0 }, { 13.0 } } } } }, { { { { { 14.0 } }, { { 15.0 }, { 16.0 }, { 17.0 } } } } }, { { { 18.0 } }, { { 19.0 }, { 20.0 }, { 21.0 } } } } });
    s6 v1({ { { { { 22.0 }, { 23.0 } }, { { { { { 24.0 } }, { { 25.0 }, { 26.0 }, { 27.0 } } } }, { { { { { 28.0 } }, { { 29.0 }, { 30.0 }, { 31.0 } } } }, { { { { 32.0 } }, { { 33.0 }, { 34.0 }, { 35.0 } } } } }, { { { { { 36.0 } }, { { 37.0 }, { 38.0 }, { 39.0 } } } } }, { { { 40.0 } }, { { 41.0 }, { 42.0 }, { 43.0 } } } } }, { { { 44.0 }, { 45.0 } }, { { { { { 46.0 } }, { { 47.0 }, { 48.0 }, { 49.0 } } } }, { { { { { 50.0 } }, { { 51.0 }, { 52.0 }, { 53.0 } } } }, { { { { 54.0 } }, { { 55.0 }, { 56.0 }, { 57.0 } } } } }, { { { { { 58.0 } }, { { 59.0 }, { 60.0 }, { 61.0 } } } } }, { { { 62.0 } }, { { 63.0 }, { 64.0 }, { 65.0 } } } } }, { { { 66.0 }, { 67.0 } }, { { { { { 68.0 } }, { { 69.0 }, { 70.0 }, { 71.0 } } } }, { { { { { 72.0 } }, { { 73.0 }, { 74.0 }, { 75.0 } } } }, { { { { 76.0 } }, { { 77.0 }, { 78.0 }, { 79.0 } } } } }, { { { { { 80.0 } }, { { 81.0 }, { 82.0 }, { 83.0 } } } } }, { { { 84.0 } }, { { 85.0 }, { 86.0 }, { 87.0 } } } } } }, { { { 88.0 } }, { { 89.0 }, { 90.0 }, { 91.0 } } } });
    double v2(92.0);
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
