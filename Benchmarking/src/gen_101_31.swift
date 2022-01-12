  import Dispatch
  struct s0 {
    var p0: [[Double]]
    var p1: [[Double]]
  }
  struct s1 {
    var p0: s0
    var p1: s0
  }
  struct s7 {
    var p0: [s1]
    var p1: [[s1]]
  }
  func f88(_ v0: [s0]) -> [s0] {
    var v42: [s0] = v0
    let v44: s0 = v42[0]
    v42[0] = v44
    return v42
  }
  @inline(never)
  func f0(_ v0: [[s0]], _ v1: s7, _ v2: Double) -> Double {
    let v7: [s0] = v0[1]
    let v22: [s0] = f88(v7)
    let v59: s0 = v22[0]
    let v160: [[Double]] = v59.p0
    let v45: [Double] = v160[2]
    let v85: Double = v45[0]
    var v98: Double = v85
    return v98
  }
  func benchmark() {
    let v0: [[s0]] = [[s0(p0: [[0.0], [1.0], [2.0]], p1: [[3.0], [4.0], [5.0]])], [s0(p0: [[6.0], [7.0], [8.0]], p1: [[9.0], [10.0], [11.0]])]]
    let v1: s7 = s7(p0: [s1(p0: s0(p0: [[12.0], [13.0], [14.0]], p1: [[15.0], [16.0], [17.0]]), p1: s0(p0: [[18.0], [19.0], [20.0]], p1: [[21.0], [22.0], [23.0]]))], p1: [[s1(p0: s0(p0: [[24.0], [25.0], [26.0]], p1: [[27.0], [28.0], [29.0]]), p1: s0(p0: [[30.0], [31.0], [32.0]], p1: [[33.0], [34.0], [35.0]]))]])
    let v2: Double = 36.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 36.0
    for _ in 1...1000 {
      result = f0(v0, v1, v2)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
