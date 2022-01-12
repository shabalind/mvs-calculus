  #include <vector>
  #include <iostream>
  #include <chrono>
  struct s0 {
    std::vector<std::vector<double>> p0;
    std::vector<std::vector<double>> p1;
    std::vector<std::vector<double>> p2;
    s0(std::vector<std::vector<double>> v0, std::vector<std::vector<double>> v1, std::vector<std::vector<double>> v2): p0(v0), p1(v1), p2(v2) { }
  };
  struct s1 {
    std::vector<std::vector<s0>> p0;
    std::vector<s0> p1;
    s1(std::vector<std::vector<s0>> v0, std::vector<s0> v1): p0(v0), p1(v1) { }
  };
  struct s2 {
    std::vector<std::vector<s0>> p0;
    std::vector<std::vector<s1>> p1;
    s2(std::vector<std::vector<s0>> v0, std::vector<std::vector<s1>> v1): p0(v0), p1(v1) { }
  };
  struct s3 {
    std::vector<s2> p0;
    s1 p1;
    s3(std::vector<s2> v0, s1 v1): p0(v0), p1(v1) { }
  };
  s3 f45(const s3 &v0) {
    const s1 v1 = v0.p1;
    const std::vector<std::vector<s0>> v10 = v1.p0;
    const std::vector<std::vector<s0>> v12 = v1.p0;
    const std::vector<s0> v7 = v10[0];
    std::vector<std::vector<s0>> v14 = v12;
    const std::vector<s0> v8 = v10[0];
    const std::vector<s0> v6 = v1.p1;
    std::vector<s0> v16 = v6;
    v14[0] = v8;
    s1 v22 = v1;
    const std::vector<s0> v26 = v1.p1;
    const std::vector<s0> v21 = v22.p1;
    v22.p1 = v26;
    v22.p0 = v14;
    v22.p0 = v14;
    v14[0] = v7;
    v22.p1 = v16;
    s3 v123 = v0;
    const std::vector<s0> v38 = v14[0];
    v22.p0 = v12;
    v14[0] = v38;
    v22.p1 = v21;
    v123.p1 = v22;
    s3 v263 = v123;
    return v263;
  }
  __attribute__((noinline))
  double f0(const s3 &v0, const double &v1) {
    const s3 v4 = f45(v0);
    double v6 = v1;
    const s1 v7 = v4.p1;
    const std::vector<std::vector<s0>> v26 = v7.p0;
    const std::vector<s0> v21 = v26[0];
    const s0 v29 = v21[0];
    const std::vector<std::vector<double>> v31 = v29.p2;
    const std::vector<double> v62 = v31[0];
    std::vector<double> v51 = v62;
    const double v68 = v51[0];
    const double v41 = v6 * v68;
    v51[0] = v1;
    return v41;
  }
  int main() {
    s3 v0({ { { { { { { { 0.0 }, { 1.0 } }, { { 2.0 } }, { { 3.0 } } } }, { { { { 4.0 }, { 5.0 } }, { { 6.0 } }, { { 7.0 } } } }, { { { { 8.0 }, { 9.0 } }, { { 10.0 } }, { { 11.0 } } } } }, { { { { { { { { 12.0 }, { 13.0 } }, { { 14.0 } }, { { 15.0 } } } } }, { { { { 16.0 }, { 17.0 } }, { { 18.0 } }, { { 19.0 } } }, { { { 20.0 }, { 21.0 } }, { { 22.0 } }, { { 23.0 } } } } } } } }, { { { { { { 24.0 }, { 25.0 } }, { { 26.0 } }, { { 27.0 } } } }, { { { { 28.0 }, { 29.0 } }, { { 30.0 } }, { { 31.0 } } } }, { { { { 32.0 }, { 33.0 } }, { { 34.0 } }, { { 35.0 } } } } }, { { { { { { { { 36.0 }, { 37.0 } }, { { 38.0 } }, { { 39.0 } } } } }, { { { { 40.0 }, { 41.0 } }, { { 42.0 } }, { { 43.0 } } }, { { { 44.0 }, { 45.0 } }, { { 46.0 } }, { { 47.0 } } } } } } } }, { { { { { { 48.0 }, { 49.0 } }, { { 50.0 } }, { { 51.0 } } } }, { { { { 52.0 }, { 53.0 } }, { { 54.0 } }, { { 55.0 } } } }, { { { { 56.0 }, { 57.0 } }, { { 58.0 } }, { { 59.0 } } } } }, { { { { { { { { 60.0 }, { 61.0 } }, { { 62.0 } }, { { 63.0 } } } } }, { { { { 64.0 }, { 65.0 } }, { { 66.0 } }, { { 67.0 } } }, { { { 68.0 }, { 69.0 } }, { { 70.0 } }, { { 71.0 } } } } } } } } }, { { { { { { 72.0 }, { 73.0 } }, { { 74.0 } }, { { 75.0 } } } } }, { { { { 76.0 }, { 77.0 } }, { { 78.0 } }, { { 79.0 } } }, { { { 80.0 }, { 81.0 } }, { { 82.0 } }, { { 83.0 } } } } } });
    double v1(84.0);
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
