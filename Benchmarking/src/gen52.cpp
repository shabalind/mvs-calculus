  #include <vector>
  #include <iostream>
  #include <chrono>
  struct s0 {
    std::vector<double> p0;
    std::vector<std::vector<double>> p1;
    s0(std::vector<double> v0, std::vector<std::vector<double>> v1): p0(v0), p1(v1) { }
  };
  struct s1 {
    std::vector<std::vector<s0>> p0;
    s0 p1;
    s1(std::vector<std::vector<s0>> v0, s0 v1): p0(v0), p1(v1) { }
  };
  struct s2 {
    s1 p0;
    std::vector<s0> p1;
    s2(s1 v0, std::vector<s0> v1): p0(v0), p1(v1) { }
  };
  s1 f13(const s1 &v0) {
    const s0 v2 = v0.p1;
    s1 v4 = v0;
    s1 v3 = v0;
    v3.p1 = v2;
    s1 v5 = v4;
    s1 v9 = v5;
    const s0 v14 = v0.p1;
    const s0 v17 = v9.p1;
    v3.p1 = v2;
    v4.p1 = v17;
    s1 v31 = v4;
    const std::vector<std::vector<s0>> v33 = v3.p0;
    const std::vector<std::vector<s0>> v46 = v31.p0;
    const s1 v58(v46, v14);
    const std::vector<std::vector<s0>> v65 = v4.p0;
    const std::vector<s0> v63 = v33[0];
    s1 v50 = v58;
    v4.p0 = v65;
    v50.p0 = v33;
    const s0 v115 = v63[0];
    v3.p1 = v115;
    return v50;
  }
  s0 f2(const s2 &v0, const s0 &v1, const s0 &v2) {
    const std::vector<double> v6 = v1.p0;
    const std::vector<std::vector<double>> v10 = v1.p1;
    s0 v7 = v2;
    v7.p1 = v10;
    v7.p0 = v6;
    const s1 v15 = v0.p0;
    const s1 v16 = f13(v15);
    v7.p1 = v10;
    const std::vector<std::vector<double>> v25 = v7.p1;
    const s0 v30 = v16.p1;
    v7 = v30;
    v7.p1 = v10;
    v7.p1 = v25;
    v7.p1 = v10;
    return v7;
  }
  __attribute__((noinline))
  double f0(const s1 &v0, const std::vector<std::vector<s1>> &v1, const double &v2) {
    const std::vector<std::vector<s0>> v4 = v0.p0;
    s1 v9 = v0;
    const std::vector<std::vector<s0>> v5 = v0.p0;
    v9.p0 = v4;
    const std::vector<s0> v8 = v4[0];
    v9.p0 = v5;
    const s0 v7 = v0.p1;
    const s2 v11(v9, v8);
    const s0 v3 = f2(v11, v7, v7);
    const s0 v18 = f2(v11, v3, v3);
    v9.p0 = v5;
    s2 v14 = v11;
    const s0 v17 = v9.p1;
    s0 v36 = v17;
    const s0 v31 = f2(v14, v18, v36);
    const std::vector<double> v39 = v31.p0;
    const double v29 = v39[0];
    v9.p1 = v18;
    return v29;
  }
  int main() {
    s1 v0({ { { { { 0.0 }, { { 1.0 }, { 2.0 }, { 3.0 } } } } }, { { 4.0 }, { { 5.0 }, { 6.0 }, { 7.0 } } } });
    std::vector<std::vector<s1>> v1({ { { { { { { 8.0 }, { { 9.0 }, { 10.0 }, { 11.0 } } } } }, { { 12.0 }, { { 13.0 }, { 14.0 }, { 15.0 } } } } }, { { { { { { 16.0 }, { { 17.0 }, { 18.0 }, { 19.0 } } } } }, { { 20.0 }, { { 21.0 }, { 22.0 }, { 23.0 } } } } }, { { { { { { 24.0 }, { { 25.0 }, { 26.0 }, { 27.0 } } } } }, { { 28.0 }, { { 29.0 }, { 30.0 }, { 31.0 } } } } } });
    double v2(32.0);
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
