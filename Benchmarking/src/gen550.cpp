  #include <vector>
  #include <iostream>
  #include <chrono>
  struct s0 {
    std::vector<std::vector<double>> p0;
    std::vector<std::vector<double>> p1;
    s0(std::vector<std::vector<double>> v0, std::vector<std::vector<double>> v1): p0(v0), p1(v1) { }
  };
  struct s5 {
    s0 p0;
    std::vector<std::vector<s0>> p1;
    s5(s0 v0, std::vector<std::vector<s0>> v1): p0(v0), p1(v1) { }
  };
  s5 f23(const s5 &v0) {
    s5 v3 = v0;
    const std::vector<std::vector<s0>> v1 = v0.p1;
    v3.p1 = v1;
    const std::vector<s0> v2 = v1[0];
    const std::vector<s0> v5 = v1[0];
    std::vector<std::vector<s0>> v4 = v1;
    v3.p1 = v1;
    v3.p1 = v4;
    const s0 v18 = v2[0];
    const std::vector<std::vector<double>> v6 = v18.p0;
    v4[0] = v5;
    v3.p0 = v18;
    v4[1] = v2;
    std::vector<s0> v23 = v5;
    const std::vector<std::vector<s0>> v56 = v3.p1;
    v3.p1 = v1;
    v3.p1 = v56;
    v23[0] = v18;
    const std::vector<std::vector<double>> v20 = v18.p1;
    s5 v24 = v0;
    const s0 v52(v6, v20);
    v23[0] = v52;
    std::vector<s0> v51 = v23;
    v3 = v0;
    std::vector<s0> v46 = v51;
    v4[1] = v23;
    v4[0] = v23;
    const s0 v76 = v46[0];
    s5 v109 = v3;
    const std::vector<s5> v86 { v109, v24, v0 };
    std::vector<s0> v62 = v5;
    const s0 v183 = v62[0];
    v24.p0 = v76;
    v51[0] = v183;
    v24.p0 = v183;
    const s5 v61 = v86[0];
    return v61;
  }
  __attribute__((noinline))
  double f0(const std::vector<std::vector<s5>> &v0, const double &v1) {
    const std::vector<s5> v3 = v0[0];
    const s5 v5 = v3[0];
    const s5 v4 = f23(v5);
    const s0 v29 = v4.p0;
    const std::vector<std::vector<double>> v21 = v29.p0;
    std::vector<std::vector<double>> v70 = v21;
    double v38 = v1;
    const double v49 = v38 / v1;
    const std::vector<double> v31 = v70[1];
    std::vector<double> v50 = v31;
    v50[0] = v49;
    const double v78 = v31[0];
    const double v40 = v78 - v1;
    v70[1] = v50;
    v50[0] = v1;
    double v46 = v40;
    v50[0] = v1;
    return v46;
  }
  int main() {
    std::vector<std::vector<s5>> v0({ { { { { { 0.0 }, { 1.0 }, { 2.0 } }, { { 3.0 }, { 4.0 } } }, { { { { { 5.0 }, { 6.0 }, { 7.0 } }, { { 8.0 }, { 9.0 } } } }, { { { { 10.0 }, { 11.0 }, { 12.0 } }, { { 13.0 }, { 14.0 } } } } } } } });
    double v1(15.0);
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
