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
    std::vector<std::vector<s0>> p1;
    s1(s0 v0, std::vector<std::vector<s0>> v1): p0(v0), p1(v1) { }
  };
  struct s2 {
    s1 p0;
    s1 p1;
    s2(s1 v0, s1 v1): p0(v0), p1(v1) { }
  };
  struct s3 {
    std::vector<s0> p0;
    s0 p1;
    s3(std::vector<s0> v0, s0 v1): p0(v0), p1(v1) { }
  };
  struct s6 {
    std::vector<s3> p0;
    s0 p1;
    s6(std::vector<s3> v0, s0 v1): p0(v0), p1(v1) { }
  };
  struct s10 {
    s2 p0;
    s6 p1;
    s10(s2 v0, s6 v1): p0(v0), p1(v1) { }
  };
  double f32(const double &v0, const s0 &v1) {
    const std::vector<std::vector<double>> v8 = v1.p0;
    std::vector<std::vector<double>> v4 = v8;
    const std::vector<double> v3 = v4[0];
    const std::vector<std::vector<double>> v2 = v1.p1;
    const double v5 = v3[0];
    const std::vector<double> v7 = v2[2];
    const std::vector<std::vector<double>> v17 = v1.p0;
    const std::vector<std::vector<double>> v18 = v1.p1;
    const std::vector<double> v20 = v18[0];
    v4[0] = v7;
    v4[0] = v20;
    const std::vector<double> v12 = v17[1];
    const double v16 = v12[0];
    const double v26 = v5 - v16;
    v4[0] = v3;
    return v26;
  }
  __attribute__((noinline))
  double f0(const std::vector<std::vector<s10>> &v0, const s3 &v1, const double &v2) {
    s3 v7 = v1;
    const std::vector<s0> v5 = v7.p0;
    const std::vector<s0> v10 = v7.p0;
    const s0 v22 = v10[0];
    const double v60 = f32(v2, v22);
    v7.p0 = v5;
    const double v62 = f32(v60, v22);
    return v62;
  }
  int main() {
    std::vector<std::vector<s10>> v0({ { { { { { { { 0.0 }, { 1.0 } }, { { 2.0 }, { 3.0 }, { 4.0 } } }, { { { { { 5.0 }, { 6.0 } }, { { 7.0 }, { 8.0 }, { 9.0 } } } } } }, { { { { 10.0 }, { 11.0 } }, { { 12.0 }, { 13.0 }, { 14.0 } } }, { { { { { 15.0 }, { 16.0 } }, { { 17.0 }, { 18.0 }, { 19.0 } } } } } } }, { { { { { { { 20.0 }, { 21.0 } }, { { 22.0 }, { 23.0 }, { 24.0 } } } }, { { { 25.0 }, { 26.0 } }, { { 27.0 }, { 28.0 }, { 29.0 } } } } }, { { { 30.0 }, { 31.0 } }, { { 32.0 }, { 33.0 }, { 34.0 } } } } } }, { { { { { { { 35.0 }, { 36.0 } }, { { 37.0 }, { 38.0 }, { 39.0 } } }, { { { { { 40.0 }, { 41.0 } }, { { 42.0 }, { 43.0 }, { 44.0 } } } } } }, { { { { 45.0 }, { 46.0 } }, { { 47.0 }, { 48.0 }, { 49.0 } } }, { { { { { 50.0 }, { 51.0 } }, { { 52.0 }, { 53.0 }, { 54.0 } } } } } } }, { { { { { { { 55.0 }, { 56.0 } }, { { 57.0 }, { 58.0 }, { 59.0 } } } }, { { { 60.0 }, { 61.0 } }, { { 62.0 }, { 63.0 }, { 64.0 } } } } }, { { { 65.0 }, { 66.0 } }, { { 67.0 }, { 68.0 }, { 69.0 } } } } } } });
    s3 v1({ { { { { 70.0 }, { 71.0 } }, { { 72.0 }, { 73.0 }, { 74.0 } } } }, { { { 75.0 }, { 76.0 } }, { { 77.0 }, { 78.0 }, { 79.0 } } } });
    double v2(80.0);
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
