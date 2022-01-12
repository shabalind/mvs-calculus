  import Dispatch
  struct s0 {
    var p0: [[Double]]
    var p1: [[Double]]
  }
  struct s1 {
    var p0: [s0]
    var p1: s0
  }
  struct s2 {
    var p0: [[s0]]
    var p1: [s1]
  }
  @inline(never)
  func f0(_ v0: s2, _ v1: Double) -> Double {
    var v6: Double = v1
    let v5: Double = v6 + v1
    v6 = v1
    let v21: Double = v5 - v5
    let v24: [Double] = [v1, v1, v21, v6, v5, v1]
    let v30: Double = v24[5]
    var v56: [Double] = v24
    v56[5] = v1
    v56[0] = v30
    let v58: Double = v56[0]
    return v58
  }
  func benchmark() {
    let v0: s2 = s2(p0: [[s0(p0: [[0.0], [1.0], [2.0]], p1: [[3.0], [4.0], [5.0]])]], p1: [s1(p0: [s0(p0: [[6.0], [7.0], [8.0]], p1: [[9.0], [10.0], [11.0]])], p1: s0(p0: [[12.0], [13.0], [14.0]], p1: [[15.0], [16.0], [17.0]])), s1(p0: [s0(p0: [[18.0], [19.0], [20.0]], p1: [[21.0], [22.0], [23.0]])], p1: s0(p0: [[24.0], [25.0], [26.0]], p1: [[27.0], [28.0], [29.0]]))])
    let v1: Double = 30.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 30.0
    for _ in 1...1000 {
      result = f0(v0, v1)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
