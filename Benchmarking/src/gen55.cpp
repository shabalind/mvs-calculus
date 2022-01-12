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
    std::vector<std::vector<s0>> p2;
    s1(s0 v0, s0 v1, std::vector<std::vector<s0>> v2): p0(v0), p1(v1), p2(v2) { }
  };
  struct s2 {
    std::vector<s1> p0;
    std::vector<double> p1;
    s2(std::vector<s1> v0, std::vector<double> v1): p0(v0), p1(v1) { }
  };
  s2 f68(const s2 &v0) {
    const std::vector<s1> v2 = v0.p0;
    const std::vector<double> v4 = v0.p1;
    const std::vector<double> v8 = v0.p1;
    const std::vector<std::vector<double>> v5 { v8, v8, v8, v8, v8, v8 };
    std::vector<s1> v6 = v2;
    const std::vector<s1> v18 = v0.p0;
    const std::vector<double> v1 = v5[2];
    s2 v17 = v0;
    v17.p1 = v8;
    v17.p1 = v1;
    s2 v20 = v17;
    const std::vector<double> v24 = v20.p1;
    const std::vector<double> v48 = v17.p1;
    const std::vector<double> v15 = v20.p1;
    v20.p1 = v4;
    const std::vector<double> v40 = v17.p1;
    v17.p1 = v40;
    v17.p1 = v24;
    v20.p0 = v18;
    const s2 v46(v6, v15);
    v17.p1 = v48;
    const std::vector<s1> v88 = v17.p0;
    const std::vector<s1> v89 = v46.p0;
    v17.p0 = v89;
    v17.p0 = v88;
    return v20;
  }
  s2 f62(const s2 &v0) {
    const s2 v3 = f68(v0);
    s2 v1 = v3;
    s2 v4 = v0;
    const s2 v7 = f68(v1);
    v4 = v7;
    const std::vector<double> v8 = v4.p1;
    std::vector<double> v12 = v8;
    v1.p1 = v12;
    std::vector<double> v19 = v12;
    v12 = v8;
    const double v29 = v19[0];
    v4.p1 = v19;
    const std::vector<s1> v37 = v1.p0;
    const s2 v56(v37, v8);
    v12[1] = v29;
    const s2 v39 = f68(v56);
    return v39;
  }
  __attribute__((noinline))
  double f0(const s2 &v0, const double &v1) {
    const s2 v4 = f62(v0);
    const std::vector<double> v2 = v4.p1;
    std::vector<double> v16 = v2;
    const double v30 = v2[1];
    v16[0] = v1;
    v16[0] = v30;
    v16[1] = v30;
    const double v139 = v16[0];
    v16 = v2;
    return v139;
  }
  int main() {
    s2 v0({ { { { { { 0.0 }, { 1.0 } }, { { 2.0 }, { 3.0 }, { 4.0 } } }, { { { 5.0 }, { 6.0 } }, { { 7.0 }, { 8.0 }, { 9.0 } } }, { { { { { 10.0 }, { 11.0 } }, { { 12.0 }, { 13.0 }, { 14.0 } } } }, { { { { 15.0 }, { 16.0 } }, { { 17.0 }, { 18.0 }, { 19.0 } } } }, { { { { 20.0 }, { 21.0 } }, { { 22.0 }, { 23.0 }, { 24.0 } } } } } } }, { 25.0, 26.0 } });
    double v1(27.0);
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
