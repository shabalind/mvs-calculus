  #include <vector>
  #include <iostream>
  #include <chrono>
  struct s0 {
    std::vector<std::vector<double>> p0;
    std::vector<std::vector<double>> p1;
    std::vector<std::vector<double>> p2;
    s0(std::vector<std::vector<double>> v0, std::vector<std::vector<double>> v1, std::vector<std::vector<double>> v2): p0(v0), p1(v1), p2(v2) { }
  };
  s0 f76(const s0 &v0, const s0 &v1, const s0 &v2, const s0 &v3, const s0 &v4) {
    const std::vector<std::vector<double>> v7 = v3.p1;
    const std::vector<std::vector<double>> v5 = v1.p1;
    const std::vector<std::vector<double>> v10 = v4.p1;
    s0 v12 = v2;
    s0 v16 = v2;
    v16.p1 = v7;
    v16.p2 = v10;
    const std::vector<std::vector<double>> v53 = v4.p0;
    const std::vector<std::vector<double>> v26 = v12.p1;
    const std::vector<std::vector<double>> v18 = v4.p0;
    v16.p2 = v18;
    s0 v17 = v1;
    const std::vector<std::vector<double>> v40 = v3.p1;
    v17.p2 = v7;
    const std::vector<std::vector<double>> v64 = v17.p1;
    const s0 v23(v10, v18, v53);
    v16.p1 = v64;
    s0 v44 = v17;
    const std::vector<std::vector<double>> v41 = v2.p2;
    const std::vector<s0> v39 { v44, v17, v0, v2, v16 };
    v12 = v17;
    const s0 v28(v53, v40, v64);
    v17.p1 = v5;
    std::vector<s0> v42 = v39;
    v17.p1 = v41;
    const std::vector<std::vector<double>> v32 = v16.p0;
    v17.p2 = v26;
    const std::vector<std::vector<double>> v56 = v23.p1;
    v42[3] = v28;
    v42[4] = v17;
    const s0 v58 = v42[0];
    v42[3] = v2;
    v12.p0 = v40;
    v12.p2 = v53;
    v16.p2 = v56;
    v16.p1 = v32;
    return v58;
  }
  s0 f72(const s0 &v0) {
    const s0 v2 = f76(v0, v0, v0, v0, v0);
    s0 v5 = v2;
    const s0 v7 = f76(v0, v5, v0, v5, v2);
    const s0 v8 = f76(v7, v5, v5, v0, v5);
    s0 v6 = v5;
    const std::vector<std::vector<double>> v1 = v0.p2;
    const std::vector<std::vector<double>> v3 = v2.p1;
    const s0 v4 = f76(v2, v6, v5, v6, v0);
    const s0 v12 = f76(v2, v4, v5, v8, v0);
    v5.p1 = v3;
    const s0 v16 = f76(v6, v2, v12, v8, v5);
    const s0 v19(v1, v1, v1);
    const s0 v13 = f76(v5, v19, v2, v7, v0);
    const s0 v28 = f76(v12, v0, v13, v16, v13);
    s0 v56 = v28;
    return v56;
  }
  s0 f71(const s0 &v0) {
    const std::vector<std::vector<double>> v6 = v0.p1;
    std::vector<std::vector<double>> v4 = v6;
    std::vector<std::vector<double>> v1 = v6;
    s0 v5 = v0;
    std::vector<std::vector<double>> v2 = v6;
    std::vector<std::vector<double>> v8 = v6;
    const s0 v10(v6, v4, v1);
    v5.p1 = v8;
    v5.p0 = v4;
    s0 v7 = v10;
    const s0 v17 = f72(v5);
    v5.p0 = v2;
    const s0 v11 = f76(v5, v5, v5, v7, v5);
    v2 = v8;
    const s0 v13 = f76(v5, v11, v17, v11, v17);
    return v13;
  }
  s0 f70(const s0 &v0) {
    s0 v4 = v0;
    s0 v6 = v4;
    const s0 v7 = f72(v0);
    const s0 v5 = f72(v7);
    const s0 v10 = f71(v6);
    const s0 v2 = f71(v0);
    const std::vector<std::vector<double>> v3 = v7.p2;
    const s0 v8 = f72(v2);
    const std::vector<std::vector<double>> v18 = v8.p1;
    const s0 v24 = f76(v2, v5, v4, v0, v7);
    v4 = v10;
    const std::vector<std::vector<double>> v12 = v4.p2;
    const std::vector<std::vector<double>> v11 = v24.p2;
    v6 = v24;
    v6.p1 = v12;
    const std::vector<double> v29 = v18[0];
    v6.p0 = v18;
    const std::vector<s0> v16 { v6, v24, v8, v2, v2 };
    const std::vector<std::vector<double>> v34 = v10.p2;
    v6.p0 = v3;
    v4.p0 = v11;
    v6.p1 = v34;
    std::vector<std::vector<double>> v59 = v11;
    v6.p1 = v59;
    v59[1] = v29;
    const s0 v32 = v16[0];
    return v32;
  }
  __attribute__((noinline))
  double f0(const s0 &v0, const s0 &v1, const double &v2) {
    const std::vector<std::vector<double>> v4 = v0.p2;
    const s0 v5 = f70(v1);
    const std::vector<std::vector<double>> v3 = v5.p2;
    std::vector<std::vector<double>> v6 = v3;
    const std::vector<double> v11 = v4[2];
    std::vector<double> v26 = v11;
    v6[2] = v11;
    v6[0] = v11;
    const std::vector<double> v28 = v6[2];
    v26[0] = v2;
    const double v25 = v26[0];
    v6[1] = v28;
    double v39 = v2;
    const double v32 = v26[0];
    v26[0] = v2;
    v26[0] = v32;
    v26 = v28;
    double v44 = v39;
    v26[0] = v44;
    return v25;
  }
  int main() {
    s0 v0({ { { 0.0 }, { 1.0 }, { 2.0 } }, { { 3.0 }, { 4.0 }, { 5.0 } }, { { 6.0 }, { 7.0 }, { 8.0 } } });
    s0 v1({ { { 9.0 }, { 10.0 }, { 11.0 } }, { { 12.0 }, { 13.0 }, { 14.0 } }, { { 15.0 }, { 16.0 }, { 17.0 } } });
    double v2(18.0);
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
