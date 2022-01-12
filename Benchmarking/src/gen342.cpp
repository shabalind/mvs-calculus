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
    std::vector<s0> p1;
    s1(s0 v0, std::vector<s0> v1): p0(v0), p1(v1) { }
  };
  struct s2 {
    std::vector<s1> p0;
    std::vector<double> p1;
    s2(std::vector<s1> v0, std::vector<double> v1): p0(v0), p1(v1) { }
  };
  struct s3 {
    std::vector<s2> p0;
    s2 p1;
    s3(std::vector<s2> v0, s2 v1): p0(v0), p1(v1) { }
  };
  s2 f51(const s2 &v0) {
    s2 v4 = v0;
    s2 v2 = v0;
    const std::vector<double> v8 = v4.p1;
    const std::vector<s1> v12 = v0.p0;
    v4.p1 = v8;
    const std::vector<double> v3 = v4.p1;
    v2.p1 = v3;
    v2.p1 = v8;
    const s1 v7 = v12[1];
    v4.p1 = v8;
    const std::vector<double> v11 = v4.p1;
    const std::vector<double> v18 = v0.p1;
    const std::vector<s1> v10 = v4.p0;
    v2.p1 = v18;
    const std::vector<double> v17 = v4.p1;
    v2.p1 = v3;
    const double v20 = v11[1];
    v2.p0 = v10;
    v2.p1 = v3;
    const std::vector<s1> v22 = v2.p0;
    v4.p1 = v11;
    double v35 = v20;
    const s1 v24 = v10[1];
    v4.p1 = v3;
    const double v60 = v35 / v35;
    v4.p0 = v12;
    v2.p1 = v17;
    v2.p1 = v11;
    const std::vector<double> v42 = v4.p1;
    v4.p0 = v22;
    std::vector<s1> v37 = v22;
    std::vector<double> v25 = v8;
    const s2 v49(v37, v11);
    v2.p1 = v42;
    v4.p1 = v25;
    v37[0] = v24;
    v4 = v49;
    v2.p1 = v18;
    const std::vector<s1> v46 = v0.p0;
    v25[0] = v60;
    v2.p0 = v46;
    v4.p0 = v46;
    v4.p1 = v18;
    v37[1] = v7;
    v4.p1 = v17;
    return v2;
  }
  s3 f40(const s3 &v0) {
    const s2 v4 = v0.p1;
    s2 v3 = v4;
    const s2 v1 = f51(v4);
    s3 v7 = v0;
    s2 v6 = v4;
    s3 v2 = v7;
    v7.p1 = v6;
    const s2 v9 = f51(v1);
    const std::vector<double> v15 = v9.p1;
    s3 v18 = v2;
    v18.p1 = v3;
    v3.p1 = v15;
    v7 = v18;
    return v7;
  }
  s2 f36(const s2 &v0) {
    const s2 v7 = f51(v0);
    const s2 v6 = f51(v0);
    s2 v1 = v0;
    const std::vector<s1> v2 = v1.p0;
    const s2 v8 = f51(v1);
    const s2 v4 = f51(v6);
    const std::vector<double> v10 = v7.p1;
    std::vector<double> v3 = v10;
    const std::vector<s1> v5 = v6.p0;
    const std::vector<double> v9 = v7.p1;
    std::vector<s1> v12 = v2;
    v1.p0 = v12;
    const double v13 = v10[1];
    double v18 = v13;
    v3[1] = v18;
    v1.p1 = v9;
    const s2 v17 = f51(v8);
    v3[0] = v13;
    v1.p0 = v5;
    v1.p0 = v2;
    const s2 v15 = f51(v17);
    v3[1] = v13;
    v1.p0 = v5;
    std::vector<double> v34 = v3;
    v1.p1 = v3;
    s2 v29 = v4;
    v29 = v15;
    const std::vector<double> v30 = v17.p1;
    v29.p1 = v30;
    v1.p1 = v34;
    v1.p0 = v2;
    return v29;
  }
  s3 f29(const s3 &v0) {
    s3 v1 = v0;
    const s3 v8 = f40(v0);
    const s3 v6 = f40(v8);
    const std::vector<s2> v3 = v8.p0;
    const std::vector<s2> v2 = v6.p0;
    const s2 v4 = v2[0];
    const s2 v10 = f36(v4);
    const s2 v20 = f36(v10);
    s3 v33 = v1;
    v33.p1 = v20;
    v33.p1 = v4;
    v33.p0 = v3;
    return v33;
  }
  __attribute__((noinline))
  double f0(const s3 &v0, const double &v1) {
    const s3 v4 = f29(v0);
    const s2 v7 = v4.p1;
    const std::vector<double> v11 = v7.p1;
    const std::vector<std::vector<double>> v19 { v11, v11, v11, v11, v11, v11 };
    const std::vector<double> v57 = v19[1];
    std::vector<std::vector<double>> v28 = v19;
    const std::vector<double> v46 = v28[3];
    v28[4] = v57;
    const double v108 = v46[0];
    return v108;
  }
  int main() {
    s3 v0({ { { { { { { { 0.0 }, { 1.0 } }, { { 2.0 } } }, { { { { 3.0 }, { 4.0 } }, { { 5.0 } } }, { { { 6.0 }, { 7.0 } }, { { 8.0 } } }, { { { 9.0 }, { 10.0 } }, { { 11.0 } } } } }, { { { { 12.0 }, { 13.0 } }, { { 14.0 } } }, { { { { 15.0 }, { 16.0 } }, { { 17.0 } } }, { { { 18.0 }, { 19.0 } }, { { 20.0 } } }, { { { 21.0 }, { 22.0 } }, { { 23.0 } } } } } }, { 24.0, 25.0 } } }, { { { { { { 26.0 }, { 27.0 } }, { { 28.0 } } }, { { { { 29.0 }, { 30.0 } }, { { 31.0 } } }, { { { 32.0 }, { 33.0 } }, { { 34.0 } } }, { { { 35.0 }, { 36.0 } }, { { 37.0 } } } } }, { { { { 38.0 }, { 39.0 } }, { { 40.0 } } }, { { { { 41.0 }, { 42.0 } }, { { 43.0 } } }, { { { 44.0 }, { 45.0 } }, { { 46.0 } } }, { { { 47.0 }, { 48.0 } }, { { 49.0 } } } } } }, { 50.0, 51.0 } } });
    double v1(52.0);
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
