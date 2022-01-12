  #include <vector>
  #include <iostream>
  #include <chrono>
  struct s0 {
    std::vector<std::vector<double>> p0;
    std::vector<double> p1;
    std::vector<std::vector<double>> p2;
    s0(std::vector<std::vector<double>> v0, std::vector<double> v1, std::vector<std::vector<double>> v2): p0(v0), p1(v1), p2(v2) { }
  };
  struct s1 {
    s0 p0;
    std::vector<std::vector<s0>> p1;
    s1(s0 v0, std::vector<std::vector<s0>> v1): p0(v0), p1(v1) { }
  };
  struct s2 {
    std::vector<s0> p0;
    std::vector<s1> p1;
    s2(std::vector<s0> v0, std::vector<s1> v1): p0(v0), p1(v1) { }
  };
  struct s3 {
    std::vector<s2> p0;
    std::vector<s0> p1;
    s3(std::vector<s2> v0, std::vector<s0> v1): p0(v0), p1(v1) { }
  };
  s0 f91(const s0 &v0) {
    s0 v3 = v0;
    const std::vector<std::vector<double>> v4 = v0.p2;
    std::vector<std::vector<double>> v5 = v4;
    v3.p2 = v5;
    std::vector<std::vector<double>> v2 = v4;
    const std::vector<double> v6 = v3.p1;
    const std::vector<double> v7 = v5[1];
    v3.p2 = v5;
    std::vector<double> v9 = v6;
    v5[0] = v7;
    v3.p1 = v9;
    const std::vector<double> v1 = v2[0];
    v3.p2 = v2;
    std::vector<double> v16 = v7;
    const std::vector<double> v10 = v3.p1;
    const std::vector<double> v15 = v0.p1;
    const std::vector<std::vector<double>> v11 = v3.p0;
    const std::vector<double> v8 = v11[0];
    std::vector<std::vector<double>> v12 = v11;
    v12[0] = v16;
    const s0 v14(v11, v15, v2);
    std::vector<std::vector<double>> v19 = v12;
    v3.p0 = v12;
    const std::vector<double> v18 = v3.p1;
    v3.p1 = v10;
    v3.p1 = v10;
    v19[0] = v8;
    v3.p1 = v15;
    const std::vector<std::vector<double>> v36 = v3.p0;
    const std::vector<double> v25 = v0.p1;
    v3.p0 = v36;
    v3.p2 = v2;
    std::vector<std::vector<double>> v40 = v36;
    v3.p0 = v19;
    v3.p1 = v10;
    v19[0] = v1;
    v19[0] = v8;
    v3.p1 = v18;
    v2 = v4;
    const std::vector<std::vector<double>> v44 = v14.p2;
    std::vector<std::vector<double>> v48 = v40;
    const std::vector<std::vector<double>> v120 = v3.p0;
    const std::vector<std::vector<double>> v42 = v0.p0;
    const std::vector<double> v76 = v2[1];
    v3.p0 = v120;
    v3.p2 = v2;
    v3.p0 = v120;
    const std::vector<std::vector<double>> v52 = v0.p2;
    const s0 v47(v12, v18, v44);
    v12 = v42;
    v3.p0 = v48;
    v19[0] = v76;
    v3.p1 = v18;
    v3.p0 = v42;
    v3.p2 = v52;
    std::vector<std::vector<double>> v64 = v5;
    v3.p0 = v19;
    v3.p0 = v12;
    v3.p1 = v25;
    v3.p2 = v64;
    return v47;
  }
  s1 f70(const s1 &v0) {
    const s0 v2 = v0.p0;
    const s0 v6 = f91(v2);
    const s0 v4 = f91(v6);
    const std::vector<std::vector<s0>> v11 = v0.p1;
    const std::vector<s1> v36 { v0, v0, v0, v0, v0, v0, v0 };
    const s1 v52 = v36[6];
    s1 v29 = v52;
    v29.p1 = v11;
    const std::vector<std::vector<s0>> v37 = v0.p1;
    v29.p1 = v37;
    v29.p0 = v2;
    v29.p0 = v4;
    return v29;
  }
  s0 f36(const s0 &v0) {
    const std::vector<double> v7 = v0.p1;
    s0 v4 = v0;
    v4.p1 = v7;
    v4.p1 = v7;
    const s0 v22 = f91(v4);
    s0 v40 = v22;
    return v40;
  }
  s0 f7(const s1 &v0, const s0 &v1) {
    const std::vector<double> v7 = v1.p1;
    s0 v8 = v1;
    const s0 v12 = f36(v8);
    const s0 v21 = f36(v12);
    v8.p1 = v7;
    return v21;
  }
  __attribute__((noinline))
  double f0(const s3 &v0, const s1 &v1, const double &v2) {
    const s1 v9 = f70(v1);
    const s0 v10 = v9.p0;
    const std::vector<std::vector<double>> v17 = v10.p0;
    std::vector<std::vector<double>> v11 = v17;
    const std::vector<double> v21 = v11[0];
    const std::vector<double> v12 = v11[0];
    const s0 v24 = f7(v9, v10);
    v11 = v17;
    const std::vector<double> v18 = v17[0];
    const std::vector<std::vector<double>> v36 = v24.p2;
    std::vector<std::vector<double>> v31 = v36;
    const std::vector<double> v41 = v31[1];
    const std::vector<double> v104 = v17[0];
    v11[0] = v41;
    v11[0] = v104;
    std::vector<double> v74 = v21;
    v11 = v17;
    std::vector<double> v125 = v18;
    const double v195 = v41[0];
    v11[0] = v12;
    v11[0] = v125;
    v31[1] = v12;
    v31[0] = v74;
    return v195;
  }
  int main() {
    s3 v0({ { { { { { { 0.0 } }, { 1.0, 2.0 }, { { 3.0 }, { 4.0 } } }, { { { 5.0 } }, { 6.0, 7.0 }, { { 8.0 }, { 9.0 } } }, { { { 10.0 } }, { 11.0, 12.0 }, { { 13.0 }, { 14.0 } } } }, { { { { { 15.0 } }, { 16.0, 17.0 }, { { 18.0 }, { 19.0 } } }, { { { { { 20.0 } }, { 21.0, 22.0 }, { { 23.0 }, { 24.0 } } } }, { { { { 25.0 } }, { 26.0, 27.0 }, { { 28.0 }, { 29.0 } } } }, { { { { 30.0 } }, { 31.0, 32.0 }, { { 33.0 }, { 34.0 } } } } } } } }, { { { { { 35.0 } }, { 36.0, 37.0 }, { { 38.0 }, { 39.0 } } }, { { { 40.0 } }, { 41.0, 42.0 }, { { 43.0 }, { 44.0 } } }, { { { 45.0 } }, { 46.0, 47.0 }, { { 48.0 }, { 49.0 } } } }, { { { { { 50.0 } }, { 51.0, 52.0 }, { { 53.0 }, { 54.0 } } }, { { { { { 55.0 } }, { 56.0, 57.0 }, { { 58.0 }, { 59.0 } } } }, { { { { 60.0 } }, { 61.0, 62.0 }, { { 63.0 }, { 64.0 } } } }, { { { { 65.0 } }, { 66.0, 67.0 }, { { 68.0 }, { 69.0 } } } } } } } } }, { { { { 70.0 } }, { 71.0, 72.0 }, { { 73.0 }, { 74.0 } } } } });
    s1 v1({ { { { 75.0 } }, { 76.0, 77.0 }, { { 78.0 }, { 79.0 } } }, { { { { { 80.0 } }, { 81.0, 82.0 }, { { 83.0 }, { 84.0 } } } }, { { { { 85.0 } }, { 86.0, 87.0 }, { { 88.0 }, { 89.0 } } } }, { { { { 90.0 } }, { 91.0, 92.0 }, { { 93.0 }, { 94.0 } } } } } });
    double v2(95.0);
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
