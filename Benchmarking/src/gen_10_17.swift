  import Dispatch
  struct s0 {
    var p0: [[Double]]
    var p1: [[Double]]
  }
  struct s1 {
    var p0: [s0]
    var p1: s0
  }
  @inline(never)
  func f0(_ v0: s1, _ v1: Double) -> Double {
    let v3: s0 = v0.p1
    let v6: [[Double]] = v3.p1
    var v7: Double = v1
    let v15: [Double] = v6[0]
    var v2: [Double] = v15
    v2[0] = v7
    v2[0] = v1
    let v10: s0 = v0.p1
    let v20: Double = v15[0]
    v2[0] = v1
    var v105: Double = v20
    let v38: [[Double]] = v10.p0
    let v53: Double = v2[0]
    var v104: Double = v53
    let v67: [Double] = v38[0]
    v104 = v105
    v105 = v104
    v2 = v67
    return v104
  }
  func benchmark() {
    let v0: s1 = s1(p0: [s0(p0: [[0.0]], p1: [[1.0], [2.0]]), s0(p0: [[3.0]], p1: [[4.0], [5.0]]), s0(p0: [[6.0]], p1: [[7.0], [8.0]])], p1: s0(p0: [[9.0]], p1: [[10.0], [11.0]]))
    let v1: Double = 12.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 12.0
    for _ in 1...1000 {
      result = f0(v0, v1)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
