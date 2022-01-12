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
    std::vector<std::vector<s0>> p1;
    s1(std::vector<std::vector<s0>> v0, std::vector<std::vector<s0>> v1): p0(v0), p1(v1) { }
  };
  struct s3 {
    std::vector<s1> p0;
    s1 p1;
    s3(std::vector<s1> v0, s1 v1): p0(v0), p1(v1) { }
  };
  s1 f46(const s1 &v0) {
    const std::vector<std::vector<s0>> v7 = v0.p0;
    const std::vector<std::vector<std::vector<s0>>> v1 { v7, v7, v7, v7 };
    const std::vector<std::vector<std::vector<std::vector<s0>>>> v2 { v1, v1, v1, v1, v1, v1 };
    const std::vector<std::vector<s0>> v5 = v0.p0;
    s1 v6 = v0;
    s1 v8 = v6;
    const std::vector<std::vector<s0>> v4 = v6.p1;
    std::vector<std::vector<s0>> v10 = v4;
    std::vector<std::vector<std::vector<s0>>> v14 = v1;
    const std::vector<std::vector<std::vector<s0>>> v3 = v2[4];
    const std::vector<std::vector<s0>> v9 = v8.p1;
    std::vector<std::vector<std::vector<std::vector<s0>>>> v20 = v2;
    v20[3] = v3;
    std::vector<std::vector<s0>> v12 = v5;
    const std::vector<std::vector<std::vector<s0>>> v11 = v20[1];
    v20[5] = v14;
    v20[0] = v14;
    v6.p0 = v5;
    const std::vector<std::vector<s0>> v18 = v8.p0;
    const std::vector<std::vector<s0>> v16 = v6.p0;
    const std::vector<s0> v13 = v10[2];
    const s0 v23 = v13[0];
    v14[1] = v9;
    v10[0] = v13;
    const s0 v30 = v13[0];
    v8.p0 = v10;
    v8.p1 = v7;
    const std::vector<std::vector<s0>> v46 = v11[3];
    const std::vector<std::vector<s0>> v15 = v0.p0;
    const std::vector<std::vector<s0>> v26 = v6.p1;
    v14[0] = v18;
    v6.p0 = v15;
    const std::vector<s0> v21 = v10[2];
    const std::vector<std::vector<s0>> v25 = v8.p0;
    v6.p1 = v16;
    std::vector<std::vector<std::vector<s0>>> v29 = v11;
    v8.p1 = v26;
    s1 v57 = v0;
    std::vector<s0> v48 = v13;
    v10[2] = v13;
    const std::vector<std::vector<s0>> v68 = v8.p0;
    s1 v51 = v6;
    v20[2] = v29;
    const std::vector<std::vector<s0>> v37 = v8.p1;
    v29[2] = v18;
    const std::vector<std::vector<s0>> v45 = v51.p0;
    v57.p1 = v46;
    const std::vector<std::vector<s0>> v53 = v51.p0;
    const std::vector<std::vector<s0>> v36 = v0.p1;
    v29[2] = v12;
    std::vector<s0> v84 = v21;
    v8.p0 = v37;
    v12[1] = v48;
    v57.p0 = v45;
    const std::vector<std::vector<s0>> v61 = v51.p1;
    v6.p0 = v53;
    v6.p1 = v10;
    v8.p1 = v4;
    v20[4] = v3;
    v84 = v48;
    v84[0] = v30;
    const std::vector<std::vector<s0>> v54 = v51.p0;
    v8.p0 = v9;
    v8.p0 = v18;
    v20 = v2;
    v51.p0 = v15;
    v29[0] = v36;
    const std::vector<s0> v157 = v53[0];
    v6.p1 = v15;
    s1 v113 = v6;
    v12 = v54;
    v10[0] = v157;
    v113.p0 = v25;
    v57.p0 = v7;
    v12[1] = v84;
    v57.p0 = v61;
    v84[0] = v23;
    const std::vector<std::vector<s0>> v102 = v113.p1;
    v6.p1 = v9;
    v51 = v113;
    v51.p1 = v54;
    v113.p0 = v102;
    v57.p1 = v68;
    return v57;
  }
  s3 f29(const s3 &v0) {
    s3 v1 = v0;
    const s1 v6 = v1.p1;
    const s1 v5 = f46(v6);
    const std::vector<s1> v7 = v0.p0;
    v1.p0 = v7;
    s3 v2 = v0;
    const std::vector<s1> v10 = v2.p0;
    std::vector<s1> v16 = v10;
    const std::vector<std::vector<s1>> v9 { v16 };
    v16[0] = v6;
    s1 v4 = v5;
    v16[0] = v4;
    const std::vector<s1> v17 = v9[0];
    const s1 v21 = f46(v5);
    v16[0] = v6;
    const std::vector<s1> v15 = v1.p0;
    const std::vector<std::vector<s0>> v26 = v21.p1;
    v4.p1 = v26;
    const std::vector<std::vector<s0>> v41 = v4.p1;
    const s1 v22 = f46(v6);
    v1.p0 = v10;
    const s1 v25 = f46(v6);
    const std::vector<std::vector<s0>> v40 = v25.p0;
    std::vector<std::vector<s0>> v62 = v40;
    v2.p1 = v4;
    const std::vector<s1> v109 = v9[0];
    v4.p1 = v26;
    v4.p0 = v41;
    const s1 v66 = v109[1];
    v16[1] = v22;
    s3 v68 = v2;
    v4.p1 = v62;
    v1.p1 = v4;
    const std::vector<std::vector<s0>> v84 = v25.p0;
    v68.p0 = v17;
    v4.p1 = v84;
    v1.p0 = v15;
    s3 v123 = v68;
    v68.p1 = v66;
    return v123;
  }
  __attribute__((noinline))
  double f0(const s3 &v0, const double &v1) {
    const s3 v6 = f29(v0);
    const s1 v7 = v6.p1;
    const std::vector<std::vector<s0>> v22 = v7.p0;
    double v20 = v1;
    const std::vector<s0> v38 = v22[1];
    const s0 v82 = v38[0];
    const std::vector<std::vector<double>> v101 = v82.p1;
    const std::vector<double> v91 = v101[2];
    const double v85 = v91[0];
    const double v132 = v85 + v20;
    return v132;
  }
  int main() {
    s3 v0({ { { { { { { { 0.0 }, { 1.0 } }, { { 2.0 }, { 3.0 }, { 4.0 } } } }, { { { { 5.0 }, { 6.0 } }, { { 7.0 }, { 8.0 }, { 9.0 } } } }, { { { { 10.0 }, { 11.0 } }, { { 12.0 }, { 13.0 }, { 14.0 } } } } }, { { { { { 15.0 }, { 16.0 } }, { { 17.0 }, { 18.0 }, { 19.0 } } } }, { { { { 20.0 }, { 21.0 } }, { { 22.0 }, { 23.0 }, { 24.0 } } } }, { { { { 25.0 }, { 26.0 } }, { { 27.0 }, { 28.0 }, { 29.0 } } } } } }, { { { { { { 30.0 }, { 31.0 } }, { { 32.0 }, { 33.0 }, { 34.0 } } } }, { { { { 35.0 }, { 36.0 } }, { { 37.0 }, { 38.0 }, { 39.0 } } } }, { { { { 40.0 }, { 41.0 } }, { { 42.0 }, { 43.0 }, { 44.0 } } } } }, { { { { { 45.0 }, { 46.0 } }, { { 47.0 }, { 48.0 }, { 49.0 } } } }, { { { { 50.0 }, { 51.0 } }, { { 52.0 }, { 53.0 }, { 54.0 } } } }, { { { { 55.0 }, { 56.0 } }, { { 57.0 }, { 58.0 }, { 59.0 } } } } } } }, { { { { { { 60.0 }, { 61.0 } }, { { 62.0 }, { 63.0 }, { 64.0 } } } }, { { { { 65.0 }, { 66.0 } }, { { 67.0 }, { 68.0 }, { 69.0 } } } }, { { { { 70.0 }, { 71.0 } }, { { 72.0 }, { 73.0 }, { 74.0 } } } } }, { { { { { 75.0 }, { 76.0 } }, { { 77.0 }, { 78.0 }, { 79.0 } } } }, { { { { 80.0 }, { 81.0 } }, { { 82.0 }, { 83.0 }, { 84.0 } } } }, { { { { 85.0 }, { 86.0 } }, { { 87.0 }, { 88.0 }, { 89.0 } } } } } } });
    double v1(90.0);
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
