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
    std::vector<s0> p1;
    s1(std::vector<s0> v0, std::vector<s0> v1): p0(v0), p1(v1) { }
  };
  s1 f33(const s1 &v0) {
    s1 v4 = v0;
    const std::vector<s0> v5 = v4.p1;
    v4.p1 = v5;
    std::vector<s0> v7 = v5;
    const s0 v2 = v7[0];
    s1 v12 = v4;
    const s0 v1 = v7[0];
    const std::vector<s0> v3 = v0.p1;
    s1 v11 = v4;
    v7[0] = v2;
    s1 v10 = v4;
    s1 v24 = v0;
    const s0 v14 = v5[0];
    const std::vector<s1> v16 { v12, v0, v11, v10, v24, v4 };
    v7[0] = v14;
    std::vector<s1> v13 = v16;
    v10.p0 = v7;
    v7[0] = v14;
    v13[3] = v12;
    const std::vector<s0> v18 = v4.p1;
    const s0 v31 = v3[0];
    std::vector<s0> v36 = v18;
    s0 v33 = v31;
    v11.p0 = v7;
    v11.p1 = v36;
    v12.p1 = v7;
    std::vector<s1> v46 = v13;
    const s1 v78 = v46[3];
    const std::vector<std::vector<double>> v40 = v1.p1;
    v13[3] = v0;
    s1 v60 = v78;
    v4.p0 = v7;
    const std::vector<s0> v50 = v4.p1;
    v11 = v10;
    v33.p1 = v40;
    v4.p0 = v50;
    v36[0] = v33;
    v4.p0 = v7;
    return v60;
  }
  double f5(const double &v0) {
    double v3 = v0;
    const std::vector<double> v2 { v3 };
    double v7 = v3;
    double v6 = v0;
    double v5 = v3;
    double v4 = v7;
    v5 = v3;
    const double v10 = v2[0];
    std::vector<double> v8 = v2;
    std::vector<double> v14 = v8;
    const double v16 = v4 + v5;
    std::vector<double> v9 = v14;
    v5 = v4;
    const double v13 = v9[0];
    v7 = v6;
    double v25 = v3;
    const double v32 = v14[0];
    const double v17 = v14[0];
    const double v18 = v14[0];
    double v27 = v25;
    const double v28 = v8[0];
    std::vector<double> v19 = v8;
    v9[0] = v16;
    v27 = v18;
    v14[0] = v17;
    const double v21 = v19[0];
    v19[0] = v18;
    const double v20 = v8[0];
    double v55 = v27;
    v14[0] = v6;
    v19[0] = v32;
    const double v38 = v19[0];
    double v34 = v21;
    v8[0] = v55;
    v8[0] = v13;
    v8[0] = v10;
    v3 = v38;
    const std::vector<double> v46 { v28, v13, v38, v20, v16, v25 };
    v19[0] = v34;
    std::vector<double> v73 = v46;
    v73[3] = v25;
    v9[0] = v25;
    v34 = v13;
    const double v43 = v73[2];
    return v43;
  }
  __attribute__((noinline))
  double f0(const s1 &v0, const double &v1) {
    const s1 v3 = f33(v0);
    const std::vector<s0> v5 = v3.p1;
    const s0 v4 = v5[0];
    const std::vector<std::vector<double>> v14 = v4.p1;
    const std::vector<double> v36 = v14[0];
    const double v34 = v36[0];
    const double v35 = f5(v34);
    return v35;
  }
  int main() {
    s1 v0({ { { { { 0.0 }, { 1.0 }, { 2.0 } }, { { 3.0 } } } }, { { { { 4.0 }, { 5.0 }, { 6.0 } }, { { 7.0 } } } } });
    double v1(8.0);
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
