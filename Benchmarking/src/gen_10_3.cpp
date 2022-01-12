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
    std::vector<std::vector<s0>> p1;
    s1(std::vector<s0> v0, std::vector<std::vector<s0>> v1): p0(v0), p1(v1) { }
  };
  struct s3 {
    s1 p0;
    std::vector<std::vector<s1>> p1;
    s3(s1 v0, std::vector<std::vector<s1>> v1): p0(v0), p1(v1) { }
  };
  s0 f78(const s0 &v0) {
    s0 v4 = v0;
    const std::vector<std::vector<double>> v7 = v4.p0;
    const std::vector<std::vector<double>> v1 = v4.p1;
    v4 = v0;
    v4.p1 = v1;
    v4.p0 = v7;
    const std::vector<std::vector<double>> v34 = v4.p0;
    const std::vector<std::vector<double>> v29 = v0.p1;
    const std::vector<std::vector<double>> v20 = v0.p0;
    v4.p1 = v1;
    v4.p0 = v20;
    v4.p1 = v29;
    v4.p0 = v34;
    const std::vector<std::vector<double>> v28 = v0.p1;
    v4.p1 = v28;
    s0 v83 = v4;
    return v83;
  }
  std::vector<s0> f68(const std::vector<s0> &v0) {
    const s0 v6 = v0[0];
    const std::vector<std::vector<double>> v7 = v6.p1;
    std::vector<std::vector<double>> v8 = v7;
    s0 v3 = v6;
    const std::vector<std::vector<double>> v4 = v3.p0;
    std::vector<s0> v5 = v0;
    v3 = v6;
    std::vector<s0> v12 = v5;
    const s0 v15 = f78(v6);
    const std::vector<double> v19 = v4[1];
    const std::vector<std::vector<double>> v9 = v6.p0;
    const s0 v17 = f78(v6);
    v12[0] = v6;
    const s0 v14 = v0[0];
    v3.p1 = v7;
    std::vector<double> v34 = v19;
    s0 v16 = v14;
    const std::vector<std::vector<double>> v30 = v15.p0;
    const s0 v21 = v12[0];
    std::vector<std::vector<double>> v33 = v30;
    v12[0] = v6;
    v33[0] = v34;
    v16.p1 = v8;
    const std::vector<std::vector<double>> v32 = v21.p0;
    v8[0] = v34;
    v12[0] = v3;
    v3.p0 = v32;
    v16.p0 = v9;
    v12[0] = v21;
    v3.p0 = v33;
    const std::vector<std::vector<double>> v97 = v17.p1;
    v3.p0 = v32;
    v5[0] = v16;
    v16.p1 = v97;
    std::vector<s0> v169 = v12;
    return v169;
  }
  s0 f33(const s3 &v0, const s0 &v1) {
    const s0 v5 = f78(v1);
    s0 v7 = v1;
    const std::vector<std::vector<double>> v12 = v1.p1;
    v7.p1 = v12;
    const std::vector<std::vector<double>> v25 = v5.p0;
    v7.p1 = v12;
    v7.p0 = v25;
    return v7;
  }
  __attribute__((noinline))
  double f0(const std::vector<s3> &v0, const double &v1) {
    const s3 v5 = v0[0];
    const s1 v3 = v5.p0;
    const std::vector<std::vector<s0>> v12 = v3.p1;
    const std::vector<s0> v8 = v12[0];
    const s0 v6 = v8[0];
    const std::vector<s0> v9 = f68(v8);
    const s0 v16 = v9[0];
    std::vector<s0> v11 = v9;
    v11[0] = v16;
    const s0 v19 = v11[0];
    v11 = v9;
    const std::vector<std::vector<s0>> v25 = v3.p1;
    const std::vector<std::vector<double>> v78 = v19.p1;
    v11[0] = v6;
    const std::vector<s0> v60 = v25[0];
    v11 = v60;
    const s0 v22 = f33(v5, v19);
    v11[0] = v6;
    v11[0] = v19;
    std::vector<std::vector<double>> v47 = v78;
    v11[0] = v22;
    v11[0] = v16;
    const std::vector<double> v113 = v47[0];
    const double v79 = v113[0];
    return v79;
  }
  int main() {
    std::vector<s3> v0({ { { { { { { 0.0 }, { 1.0 } }, { { 2.0 } } } }, { { { { { 3.0 }, { 4.0 } }, { { 5.0 } } } }, { { { { 6.0 }, { 7.0 } }, { { 8.0 } } } } } }, { { { { { { { 9.0 }, { 10.0 } }, { { 11.0 } } } }, { { { { { 12.0 }, { 13.0 } }, { { 14.0 } } } }, { { { { 15.0 }, { 16.0 } }, { { 17.0 } } } } } } } } } });
    double v1(18.0);
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
