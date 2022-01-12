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
    s0 p2;
    s0 p3;
    std::vector<s0> p4;
    s0 p5;
    s0 p6;
    s0 p7;
    s1(std::vector<s0> v0, std::vector<s0> v1, s0 v2, s0 v3, std::vector<s0> v4, s0 v5, s0 v6, s0 v7): p0(v0), p1(v1), p2(v2), p3(v3), p4(v4), p5(v5), p6(v6), p7(v7) { }
  };
  struct s2 {
    s1 p0;
    s2(s1 v0): p0(v0) { }
  };
  __attribute__((noinline))
  double f0(const std::vector<std::vector<s1>> &v0, const double &v1) {
    std::vector<std::vector<s1>> v2 = v0;
    const std::vector<s1> v7 = v2[0];
    v2[0] = v7;
    v2[0] = v7;
    v2[0] = v7;
    const std::vector<s1> v11 = v2[1];
    const s1 v6 = v7[0];
    const s2 v4(v6);
    const s1 v3 = v11[0];
    const std::vector<s1> v9 = v0[1];
    const std::vector<s1> v18 = v2[0];
    const std::vector<s1> v21 = v2[0];
    v2 = v0;
    s2 v14 = v4;
    const s1 v20 = v21[0];
    const s0 v30 = v3.p7;
    v14.p0 = v20;
    std::vector<s1> v17 = v9;
    v14.p0 = v3;
    const std::vector<std::vector<double>> v22 = v30.p0;
    v2[0] = v17;
    v2[1] = v18;
    const s1 v36 = v17[0];
    s2 v48 = v14;
    const s2 v35(v36);
    const s1 v40 = v4.p0;
    const s1 v61 = v48.p0;
    const std::vector<double> v31 = v22[1];
    v17[0] = v61;
    v17[0] = v40;
    const s1 v68 = v4.p0;
    v48 = v35;
    v14.p0 = v68;
    const double v60 = v31[0];
    return v60;
  }
  int main() {
    std::vector<std::vector<s1>> v0({ { { { { { { 0.0 }, { 1.0 }, { 2.0 } }, { { 3.0 } } } }, { { { { 4.0 }, { 5.0 }, { 6.0 } }, { { 7.0 } } }, { { { 8.0 }, { 9.0 }, { 10.0 } }, { { 11.0 } } } }, { { { 12.0 }, { 13.0 }, { 14.0 } }, { { 15.0 } } }, { { { 16.0 }, { 17.0 }, { 18.0 } }, { { 19.0 } } }, { { { { 20.0 }, { 21.0 }, { 22.0 } }, { { 23.0 } } } }, { { { 24.0 }, { 25.0 }, { 26.0 } }, { { 27.0 } } }, { { { 28.0 }, { 29.0 }, { 30.0 } }, { { 31.0 } } }, { { { 32.0 }, { 33.0 }, { 34.0 } }, { { 35.0 } } } } }, { { { { { { 36.0 }, { 37.0 }, { 38.0 } }, { { 39.0 } } } }, { { { { 40.0 }, { 41.0 }, { 42.0 } }, { { 43.0 } } }, { { { 44.0 }, { 45.0 }, { 46.0 } }, { { 47.0 } } } }, { { { 48.0 }, { 49.0 }, { 50.0 } }, { { 51.0 } } }, { { { 52.0 }, { 53.0 }, { 54.0 } }, { { 55.0 } } }, { { { { 56.0 }, { 57.0 }, { 58.0 } }, { { 59.0 } } } }, { { { 60.0 }, { 61.0 }, { 62.0 } }, { { 63.0 } } }, { { { 64.0 }, { 65.0 }, { 66.0 } }, { { 67.0 } } }, { { { 68.0 }, { 69.0 }, { 70.0 } }, { { 71.0 } } } } } });
    double v1(72.0);
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
