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
    s1(std::vector<s0> v0, std::vector<std::vector<s0>> v1): p0(v0), p1(v1) { }
  };
  struct s3 {
    std::vector<s0> p0;
    std::vector<std::vector<s1>> p1;
    s3(std::vector<s0> v0, std::vector<std::vector<s1>> v1): p0(v0), p1(v1) { }
  };
  s3 f16(const s3 &v0) {
    s3 v3 = v0;
    s3 v1 = v0;
    s3 v8 = v0;
    s3 v6 = v1;
    s3 v7 = v3;
    const std::vector<s0> v5 = v0.p0;
    v1.p0 = v5;
    v7.p0 = v5;
    s3 v2 = v1;
    v1.p0 = v5;
    v1 = v2;
    v7.p0 = v5;
    v1.p0 = v5;
    const std::vector<s3> v20 { v7, v1, v2, v2, v2, v8, v6 };
    std::vector<s0> v17 = v5;
    v17 = v5;
    v8.p0 = v17;
    const std::vector<std::vector<s1>> v33 = v3.p1;
    const s3 v67 = v20[3];
    v7.p1 = v33;
    return v67;
  }
  __attribute__((noinline))
  double f0(const std::vector<s3> &v0, const double &v1) {
    const s3 v5 = v0[1];
    double v4 = v1;
    const s3 v8 = f16(v5);
    const std::vector<s0> v20 = v8.p0;
    const s0 v11 = v20[2];
    const std::vector<std::vector<double>> v41 = v11.p1;
    const std::vector<double> v14 = v41[2];
    const double v51 = v14[0];
    const double v195 = v51 / v4;
    return v195;
  }
  int main() {
    std::vector<s3> v0({ { { { { { 0.0 } }, { { 1.0 }, { 2.0 }, { 3.0 } } }, { { { 4.0 } }, { { 5.0 }, { 6.0 }, { 7.0 } } }, { { { 8.0 } }, { { 9.0 }, { 10.0 }, { 11.0 } } } }, { { { { { { { 12.0 } }, { { 13.0 }, { 14.0 }, { 15.0 } } }, { { { 16.0 } }, { { 17.0 }, { 18.0 }, { 19.0 } } }, { { { 20.0 } }, { { 21.0 }, { 22.0 }, { 23.0 } } } }, { { { { { 24.0 } }, { { 25.0 }, { 26.0 }, { 27.0 } } } } } } } } }, { { { { { 28.0 } }, { { 29.0 }, { 30.0 }, { 31.0 } } }, { { { 32.0 } }, { { 33.0 }, { 34.0 }, { 35.0 } } }, { { { 36.0 } }, { { 37.0 }, { 38.0 }, { 39.0 } } } }, { { { { { { { 40.0 } }, { { 41.0 }, { 42.0 }, { 43.0 } } }, { { { 44.0 } }, { { 45.0 }, { 46.0 }, { 47.0 } } }, { { { 48.0 } }, { { 49.0 }, { 50.0 }, { 51.0 } } } }, { { { { { 52.0 } }, { { 53.0 }, { 54.0 }, { 55.0 } } } } } } } } } });
    double v1(56.0);
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
