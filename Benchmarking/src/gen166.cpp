  #include <vector>
  #include <iostream>
  #include <chrono>
  struct s0 {
    double p0;
    std::vector<std::vector<double>> p1;
    s0(double v0, std::vector<std::vector<double>> v1): p0(v0), p1(v1) { }
  };
  struct s1 {
    std::vector<std::vector<s0>> p0;
    std::vector<s0> p1;
    s0 p2;
    s0 p3;
    std::vector<std::vector<double>> p4;
    std::vector<s0> p5;
    s1(std::vector<std::vector<s0>> v0, std::vector<s0> v1, s0 v2, s0 v3, std::vector<std::vector<double>> v4, std::vector<s0> v5): p0(v0), p1(v1), p2(v2), p3(v3), p4(v4), p5(v5) { }
  };
  s0 f52(const s0 &v0) {
    const double v5 = v0.p0;
    const double v7 = v0.p0;
    s0 v1 = v0;
    v1.p0 = v5;
    v1.p0 = v5;
    s0 v4 = v1;
    const std::vector<std::vector<double>> v8 = v1.p1;
    const std::vector<double> v3 = v8[0];
    double v9 = v7;
    v1 = v0;
    const std::vector<std::vector<double>> v6 = v4.p1;
    std::vector<double> v16 = v3;
    std::vector<std::vector<double>> v21 = v8;
    double v11 = v9;
    const std::vector<double> v19 = v6[0];
    const s0 v56(v11, v8);
    const double v28 = v19[0];
    v21[0] = v16;
    v1.p1 = v21;
    v16[0] = v28;
    v1.p0 = v28;
    return v56;
  }
  __attribute__((noinline))
  double f0(const std::vector<s1> &v0, const double &v1) {
    const s1 v5 = v0[1];
    s1 v7 = v5;
    const std::vector<s0> v6 = v5.p1;
    v7.p5 = v6;
    const std::vector<s0> v2 = v5.p1;
    v7.p1 = v2;
    v7.p5 = v2;
    v7.p1 = v2;
    const s0 v4 = v6[1];
    s1 v10 = v7;
    s1 v46 = v10;
    const s0 v27 = v2[0];
    const s0 v26 = v10.p3;
    const s0 v22 = f52(v26);
    v10.p2 = v27;
    v46.p3 = v26;
    const s1 v25 = v0[1];
    const std::vector<s0> v123 = v46.p1;
    const s0 v38 = v25.p2;
    v10.p2 = v22;
    v10.p3 = v4;
    v10.p5 = v123;
    v10.p1 = v123;
    s0 v62 = v26;
    v7.p2 = v38;
    const double v208 = v62.p0;
    return v208;
  }
  int main() {
    std::vector<s1> v0({ { { { { 0.0, { { 1.0 } } } } }, { { 2.0, { { 3.0 } } }, { 4.0, { { 5.0 } } }, { 6.0, { { 7.0 } } } }, { 8.0, { { 9.0 } } }, { 10.0, { { 11.0 } } }, { { 12.0 }, { 13.0 } }, { { 14.0, { { 15.0 } } }, { 16.0, { { 17.0 } } }, { 18.0, { { 19.0 } } } } }, { { { { 20.0, { { 21.0 } } } } }, { { 22.0, { { 23.0 } } }, { 24.0, { { 25.0 } } }, { 26.0, { { 27.0 } } } }, { 28.0, { { 29.0 } } }, { 30.0, { { 31.0 } } }, { { 32.0 }, { 33.0 } }, { { 34.0, { { 35.0 } } }, { 36.0, { { 37.0 } } }, { 38.0, { { 39.0 } } } } } });
    double v1(40.0);
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
