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
    s1(s0 v0): p0(v0) { }
  };
  struct s2 {
    s1 p0;
    std::vector<s0> p1;
    s2(s1 v0, std::vector<s0> v1): p0(v0), p1(v1) { }
  };
  struct s3 {
    std::vector<s2> p0;
    std::vector<std::vector<s2>> p1;
    s3(std::vector<s2> v0, std::vector<std::vector<s2>> v1): p0(v0), p1(v1) { }
  };
  double f60(const double &v0) {
    double v7 = v0;
    double v6 = v0;
    double v1 = v0;
    double v8 = v6;
    double v5 = v0;
    double v10 = v8;
    v7 = v0;
    v10 = v7;
    v1 = v0;
    double v12 = v5;
    double v18 = v8;
    double v24 = v7;
    double v3 = v10;
    double v11 = v0;
    v5 = v8;
    double v28 = v24;
    double v21 = v28;
    v5 = v1;
    double v16 = v5;
    double v25 = v6;
    double v15 = v16;
    const double v17 = v11 - v12;
    double v42 = v15;
    const std::vector<double> v31 { v42, v3, v25, v21, v5, v18 };
    std::vector<double> v33 = v31;
    std::vector<double> v50 = v33;
    v50[1] = v17;
    const double v39 = v50[2];
    return v39;
  }
  __attribute__((noinline))
  double f0(const std::vector<std::vector<s3>> &v0, const s3 &v1, const double &v2) {
    const double v15 = f60(v2);
    return v15;
  }
  int main() {
    std::vector<std::vector<s3>> v0({ { { { { { { { { 0.0 } }, { { 1.0 } } } }, { { { { 2.0 } }, { { 3.0 } } }, { { { 4.0 } }, { { 5.0 } } }, { { { 6.0 } }, { { 7.0 } } } } }, { { { { { 8.0 } }, { { 9.0 } } } }, { { { { 10.0 } }, { { 11.0 } } }, { { { 12.0 } }, { { 13.0 } } }, { { { 14.0 } }, { { 15.0 } } } } }, { { { { { 16.0 } }, { { 17.0 } } } }, { { { { 18.0 } }, { { 19.0 } } }, { { { 20.0 } }, { { 21.0 } } }, { { { 22.0 } }, { { 23.0 } } } } } }, { { { { { { { 24.0 } }, { { 25.0 } } } }, { { { { 26.0 } }, { { 27.0 } } }, { { { 28.0 } }, { { 29.0 } } }, { { { 30.0 } }, { { 31.0 } } } } } } } } } });
    s3 v1({ { { { { { { 32.0 } }, { { 33.0 } } } }, { { { { 34.0 } }, { { 35.0 } } }, { { { 36.0 } }, { { 37.0 } } }, { { { 38.0 } }, { { 39.0 } } } } }, { { { { { 40.0 } }, { { 41.0 } } } }, { { { { 42.0 } }, { { 43.0 } } }, { { { 44.0 } }, { { 45.0 } } }, { { { 46.0 } }, { { 47.0 } } } } }, { { { { { 48.0 } }, { { 49.0 } } } }, { { { { 50.0 } }, { { 51.0 } } }, { { { 52.0 } }, { { 53.0 } } }, { { { 54.0 } }, { { 55.0 } } } } } }, { { { { { { { 56.0 } }, { { 57.0 } } } }, { { { { 58.0 } }, { { 59.0 } } }, { { { 60.0 } }, { { 61.0 } } }, { { { 62.0 } }, { { 63.0 } } } } } } } });
    double v2(64.0);
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
