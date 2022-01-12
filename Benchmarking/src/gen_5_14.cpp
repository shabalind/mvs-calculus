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
    s0 p1;
    s1(s0 v0, s0 v1): p0(v0), p1(v1) { }
  };
  struct s2 {
    std::vector<s1> p0;
    s0 p1;
    s2(std::vector<s1> v0, s0 v1): p0(v0), p1(v1) { }
  };
  s0 f5(const s0 &v0, const s2 &v1, const s0 &v2) {
    const s0 v5 = v1.p1;
    const s1 v4(v2, v0);
    const std::vector<s1> v3 = v1.p0;
    const s1 v15 = v3[0];
    s1 v8 = v4;
    const s0 v10 = v15.p1;
    const s0 v24 = v4.p1;
    s0 v21 = v2;
    v8.p0 = v0;
    s2 v23 = v1;
    s2 v39 = v23;
    s1 v40 = v8;
    const s0 v73 = v40.p0;
    const s0 v54 = v39.p1;
    const std::vector<std::vector<double>> v66 = v0.p0;
    v21.p0 = v66;
    v8.p0 = v54;
    const std::vector<s0> v65 { v73, v54, v54, v5, v10 };
    v39.p1 = v5;
    const s0 v145 = v65[2];
    v39.p1 = v21;
    v39.p1 = v24;
    v23.p1 = v10;
    return v145;
  }
  __attribute__((noinline))
  double f0(const s1 &v0, const s2 &v1, const double &v2) {
    s1 v5 = v0;
    const s0 v11 = v5.p1;
    const s0 v12 = v0.p0;
    s0 v4 = v12;
    v5.p0 = v4;
    v5.p1 = v4;
    const s0 v20 = f5(v11, v1, v4);
    const std::vector<std::vector<double>> v17 = v4.p1;
    const std::vector<std::vector<double>> v24 = v11.p1;
    v4.p1 = v17;
    const std::vector<double> v34 = v24[1];
    const double v123 = v34[0];
    s0 v216 = v20;
    v4 = v216;
    return v123;
  }
  int main() {
    s1 v0({ { { { 0.0 }, { 1.0 } }, { { 2.0 }, { 3.0 }, { 4.0 } } }, { { { 5.0 }, { 6.0 } }, { { 7.0 }, { 8.0 }, { 9.0 } } } });
    s2 v1({ { { { { { 10.0 }, { 11.0 } }, { { 12.0 }, { 13.0 }, { 14.0 } } }, { { { 15.0 }, { 16.0 } }, { { 17.0 }, { 18.0 }, { 19.0 } } } } }, { { { 20.0 }, { 21.0 } }, { { 22.0 }, { 23.0 }, { 24.0 } } } });
    double v2(25.0);
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
