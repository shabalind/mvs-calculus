  import Dispatch
  struct s0 {
    var p0: [[Double]]
    var p1: [[Double]]
  }
  struct s1 {
    var p0: s0
    var p1: s0
  }
  struct s2 {
    var p0: [s1]
    var p1: s0
  }
  struct s7 {
    var p0: [s2]
    var p1: s0
  }
  func f90(_ v0: s0) -> s0 {
    let v6: [[Double]] = v0.p0
    let v9: [[Double]] = v0.p1
    let v4: s0 = s0(p0: v6, p1: v9)
    let v12: [s0] = [v0, v0, v4]
    var v7: [s0] = v12
    v7[0] = v4
    let v10: s0 = v7[1]
    let v33: s0 = v12[2]
    let v26: s0 = v12[0]
    let v22: [s0] = [v33, v26, v0, v10, v4, v26]
    let v83: s0 = v22[5]
    v7[0] = v4
    return v83
  }
  func f15(_ v0: s0) -> s0 {
    let v5: s0 = f90(v0)
    let v9: s0 = f90(v5)
    let v7: s0 = f90(v9)
    let v51: [[Double]] = v9.p1
    var v28: s0 = v7
    v28.p0 = v51
    return v28
  }
  @inline(never)
  func f0(_ v0: s7, _ v1: Double) -> Double {
    let v7: s0 = v0.p1
    var v9: Double = v1
    let v26: s0 = f15(v7)
    let v20: s0 = f90(v26)
    var v27: Double = v9
    let v58: [[Double]] = v20.p0
    let v72: [Double] = v58[1]
    let v34: Double = v72[0]
    let v54: Double = v27 - v9
    var v79: Double = v54
    let v163: Double = v79 / v34
    return v163
  }
  func benchmark() {
    let v0: s7 = s7(p0: [s2(p0: [s1(p0: s0(p0: [[0.0], [1.0], [2.0]], p1: [[3.0], [4.0], [5.0]]), p1: s0(p0: [[6.0], [7.0], [8.0]], p1: [[9.0], [10.0], [11.0]]))], p1: s0(p0: [[12.0], [13.0], [14.0]], p1: [[15.0], [16.0], [17.0]]))], p1: s0(p0: [[18.0], [19.0], [20.0]], p1: [[21.0], [22.0], [23.0]]))
    let v1: Double = 24.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 24.0
    for _ in 1...1000 {
      result = f0(v0, v1)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
