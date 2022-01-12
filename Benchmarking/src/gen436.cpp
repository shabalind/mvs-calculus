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
    s0 p1;
    s1(std::vector<std::vector<s0>> v0, s0 v1): p0(v0), p1(v1) { }
  };
  struct s2 {
    s0 p0;
    std::vector<double> p1;
    s2(s0 v0, std::vector<double> v1): p0(v0), p1(v1) { }
  };
  struct s3 {
    s1 p0;
    std::vector<s2> p1;
    s3(s1 v0, std::vector<s2> v1): p0(v0), p1(v1) { }
  };
  s0 f1(const s0 &v0) {
    const std::vector<std::vector<double>> v5 = v0.p0;
    const s0 v6(v5, v5);
    s0 v3 = v0;
    const std::vector<std::vector<double>> v2 = v0.p0;
    const std::vector<std::vector<double>> v1 = v0.p1;
    const std::vector<std::vector<double>> v9 = v0.p0;
    const std::vector<std::vector<double>> v14 = v3.p1;
    const s0 v30(v9, v5);
    v3.p1 = v1;
    v3.p1 = v1;
    s0 v29 = v3;
    const std::vector<std::vector<double>> v21 = v30.p0;
    const std::vector<std::vector<double>> v26 = v29.p0;
    v3.p0 = v2;
    const std::vector<std::vector<double>> v24 = v0.p0;
    const s0 v39(v24, v26);
    const std::vector<std::vector<double>> v18 = v0.p1;
    v3 = v0;
    const std::vector<std::vector<double>> v42 = v0.p1;
    s0 v38 = v39;
    const std::vector<std::vector<double>> v70 = v39.p0;
    v38.p1 = v14;
    s0 v46 = v30;
    v46.p1 = v5;
    const std::vector<std::vector<double>> v31 = v29.p1;
    v3.p1 = v26;
    v38.p1 = v18;
    v3.p0 = v26;
    v3.p0 = v2;
    v38.p0 = v18;
    const s0 v64(v42, v21);
    v46 = v64;
    v46.p1 = v2;
    const std::vector<std::vector<double>> v119 = v46.p0;
    s0 v173 = v64;
    const std::vector<std::vector<double>> v91 = v46.p1;
    const std::vector<std::vector<double>> v114 = v6.p1;
    v173 = v38;
    v38.p1 = v119;
    v38.p0 = v91;
    v173 = v0;
    v29.p1 = v70;
    v38.p0 = v31;
    v46.p1 = v119;
    v173.p0 = v114;
    const std::vector<std::vector<double>> v177 = v173.p0;
    v3.p1 = v177;
    return v173;
  }
  __attribute__((noinline))
  double f0(const s3 &v0, const double &v1) {
    const s1 v5 = v0.p0;
    const s0 v3 = v5.p1;
    const s0 v6 = f1(v3);
    double v2 = v1;
    const std::vector<std::vector<double>> v4 = v6.p1;
    const std::vector<double> v9 = v4[0];
    std::vector<double> v11 = v9;
    v11[0] = v1;
    const double v17 = v11[0];
    v11[0] = v17;
    v11[0] = v1;
    const std::vector<double> v33 { v2, v2, v2, v2, v17 };
    v11[0] = v1;
    const double v20 = v33[4];
    v11[0] = v20;
    v11[0] = v17;
    return v20;
  }
  int main() {
    s3 v0({ { { { { { { 0.0 } }, { { 1.0 } } } }, { { { { 2.0 } }, { { 3.0 } } } }, { { { { 4.0 } }, { { 5.0 } } } } }, { { { 6.0 } }, { { 7.0 } } } }, { { { { { 8.0 } }, { { 9.0 } } }, { 10.0, 11.0 } }, { { { { 12.0 } }, { { 13.0 } } }, { 14.0, 15.0 } } } });
    double v1(16.0);
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
