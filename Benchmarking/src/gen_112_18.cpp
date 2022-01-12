  #include <vector>
  #include <iostream>
  #include <chrono>
  struct s0 {
    std::vector<std::vector<double>> p0;
    std::vector<std::vector<double>> p1;
    s0(std::vector<std::vector<double>> v0, std::vector<std::vector<double>> v1): p0(v0), p1(v1) { }
  };
  struct s1 {
    std::vector<std::vector<s0>> p0;
    std::vector<s0> p1;
    s1(std::vector<std::vector<s0>> v0, std::vector<s0> v1): p0(v0), p1(v1) { }
  };
  struct s2 {
    std::vector<s1> p0;
    std::vector<s1> p1;
    s2(std::vector<s1> v0, std::vector<s1> v1): p0(v0), p1(v1) { }
  };
  struct s3 {
    s2 p0;
    s2 p1;
    s3(s2 v0, s2 v1): p0(v0), p1(v1) { }
  };
  double f19(const double &v0, const s1 &v1) {
    const std::vector<s0> v6 = v1.p1;
    const s0 v4 = v6[0];
    const std::vector<std::vector<double>> v17 = v4.p1;
    const std::vector<double> v18 = v17[1];
    const double v36 = v18[0];
    double v72 = v36;
    return v72;
  }
  __attribute__((noinline))
  double f0(const s3 &v0, const double &v1) {
    const s2 v6 = v0.p0;
    s2 v3 = v6;
    s2 v11 = v3;
    s2 v10 = v11;
    double v8 = v1;
    const std::vector<s1> v2 = v3.p0;
    const s2 v7 = v0.p0;
    s3 v21 = v0;
    const s1 v9 = v2[0];
    const std::vector<s1> v20 = v11.p1;
    v21.p0 = v3;
    v10.p1 = v2;
    const s1 v23 = v2[0];
    const double v25 = f19(v1, v9);
    const double v41 = f19(v25, v23);
    const double v26 = v41 - v1;
    v3 = v7;
    const s1 v30 = v2[0];
    v21.p1 = v10;
    v10.p0 = v20;
    std::vector<s1> v35 = v20;
    const s2 v34 = v21.p1;
    v3.p0 = v35;
    v11.p0 = v20;
    v21 = v0;
    const double v45 = v26 * v8;
    const s2 v63 = v0.p1;
    const std::vector<s1> v230 = v34.p0;
    v3.p0 = v230;
    const std::vector<s1> v87 = v63.p0;
    const double v156 = f19(v45, v30);
    v3.p1 = v87;
    return v156;
  }
  int main() {
    s3 v0({ { { { { { { { { 0.0 }, { 1.0 }, { 2.0 } }, { { 3.0 }, { 4.0 }, { 5.0 } } } } }, { { { { 6.0 }, { 7.0 }, { 8.0 } }, { { 9.0 }, { 10.0 }, { 11.0 } } } } } }, { { { { { { { 12.0 }, { 13.0 }, { 14.0 } }, { { 15.0 }, { 16.0 }, { 17.0 } } } } }, { { { { 18.0 }, { 19.0 }, { 20.0 } }, { { 21.0 }, { 22.0 }, { 23.0 } } } } } } }, { { { { { { { { 24.0 }, { 25.0 }, { 26.0 } }, { { 27.0 }, { 28.0 }, { 29.0 } } } } }, { { { { 30.0 }, { 31.0 }, { 32.0 } }, { { 33.0 }, { 34.0 }, { 35.0 } } } } } }, { { { { { { { 36.0 }, { 37.0 }, { 38.0 } }, { { 39.0 }, { 40.0 }, { 41.0 } } } } }, { { { { 42.0 }, { 43.0 }, { 44.0 } }, { { 45.0 }, { 46.0 }, { 47.0 } } } } } } } });
    double v1(48.0);
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
