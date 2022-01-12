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
    std::vector<std::vector<s0>> p1;
    s0 p2;
    s1(s0 v0, std::vector<std::vector<s0>> v1, s0 v2): p0(v0), p1(v1), p2(v2) { }
  };
  struct s2 {
    std::vector<s0> p0;
    std::vector<s1> p1;
    s2(std::vector<s0> v0, std::vector<s1> v1): p0(v0), p1(v1) { }
  };
  struct s3 {
    s2 p0;
    s1 p1;
    s3(s2 v0, s1 v1): p0(v0), p1(v1) { }
  };
  s1 f1(const s1 &v0, const s3 &v1, const s1 &v2) {
    s3 v6 = v1;
    const std::vector<s3> v7 { v6, v1, v6 };
    v6.p1 = v2;
    const s3 v8 = v7[1];
    const std::vector<s3> v4 { v1 };
    const s1 v3 = v8.p1;
    const s3 v13 = v4[0];
    const s2 v17 = v13.p0;
    const std::vector<s1> v19 = v17.p1;
    std::vector<s1> v100 = v19;
    v100[0] = v3;
    const s1 v138 = v100[0];
    return v138;
  }
  __attribute__((noinline))
  double f0(const std::vector<s1> &v0, const std::vector<s2> &v1, const double &v2) {
    const s2 v6 = v1[1];
    std::vector<s1> v10 = v0;
    const s2 v7 = v1[1];
    s2 v4 = v6;
    const std::vector<s1> v13 = v4.p1;
    const s1 v12 = v13[1];
    const s1 v8 = v0[0];
    v4.p1 = v13;
    const std::vector<std::vector<s0>> v9 = v8.p1;
    const std::vector<s1> v17 = v7.p1;
    const s0 v3 = v8.p0;
    v10[1] = v12;
    const s1 v15 = v10[1];
    s1 v19 = v12;
    const std::vector<s1> v22 { v19, v15, v12 };
    v4.p1 = v17;
    v10[0] = v15;
    const s3 v11(v4, v15);
    v4.p1 = v17;
    v10[0] = v12;
    v4.p1 = v22;
    const s1 v24 = v17[2];
    const s1 v14 = v11.p1;
    const s1 v16 = f1(v24, v11, v19);
    const s1 v34 = f1(v15, v11, v14);
    v19.p1 = v9;
    v19.p2 = v3;
    v10[1] = v34;
    v10[1] = v16;
    const std::vector<s0> v39 = v4.p0;
    const s1 v73 = f1(v19, v11, v19);
    const s0 v63 = v39[1];
    v10[1] = v73;
    const std::vector<std::vector<double>> v98 = v63.p1;
    const std::vector<double> v101 = v98[1];
    v19.p2 = v3;
    const double v108 = v101[0];
    return v108;
  }
  int main() {
    std::vector<s1> v0({ { { { { 0.0 } }, { { 1.0 }, { 2.0 } } }, { { { { { 3.0 } }, { { 4.0 }, { 5.0 } } } } }, { { { 6.0 } }, { { 7.0 }, { 8.0 } } } }, { { { { 9.0 } }, { { 10.0 }, { 11.0 } } }, { { { { { 12.0 } }, { { 13.0 }, { 14.0 } } } } }, { { { 15.0 } }, { { 16.0 }, { 17.0 } } } } });
    std::vector<s2> v1({ { { { { { 18.0 } }, { { 19.0 }, { 20.0 } } }, { { { 21.0 } }, { { 22.0 }, { 23.0 } } } }, { { { { { 24.0 } }, { { 25.0 }, { 26.0 } } }, { { { { { 27.0 } }, { { 28.0 }, { 29.0 } } } } }, { { { 30.0 } }, { { 31.0 }, { 32.0 } } } }, { { { { 33.0 } }, { { 34.0 }, { 35.0 } } }, { { { { { 36.0 } }, { { 37.0 }, { 38.0 } } } } }, { { { 39.0 } }, { { 40.0 }, { 41.0 } } } }, { { { { 42.0 } }, { { 43.0 }, { 44.0 } } }, { { { { { 45.0 } }, { { 46.0 }, { 47.0 } } } } }, { { { 48.0 } }, { { 49.0 }, { 50.0 } } } } } }, { { { { { 51.0 } }, { { 52.0 }, { 53.0 } } }, { { { 54.0 } }, { { 55.0 }, { 56.0 } } } }, { { { { { 57.0 } }, { { 58.0 }, { 59.0 } } }, { { { { { 60.0 } }, { { 61.0 }, { 62.0 } } } } }, { { { 63.0 } }, { { 64.0 }, { 65.0 } } } }, { { { { 66.0 } }, { { 67.0 }, { 68.0 } } }, { { { { { 69.0 } }, { { 70.0 }, { 71.0 } } } } }, { { { 72.0 } }, { { 73.0 }, { 74.0 } } } }, { { { { 75.0 } }, { { 76.0 }, { 77.0 } } }, { { { { { 78.0 } }, { { 79.0 }, { 80.0 } } } } }, { { { 81.0 } }, { { 82.0 }, { 83.0 } } } } } } });
    double v2(84.0);
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
