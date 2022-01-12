  import Dispatch
  struct s0 {
    var p0: [[Double]]
    var p1: [[Double]]
  }
  struct s1 {
    var p0: [s0]
    var p1: [s0]
  }
  func f65(_ v0: Double) -> Double {
    var v3: Double = v0
    var v2: Double = v3
    var v1: Double = v2
    var v4: Double = v1
    var v8: Double = v4
    var v9: Double = v1
    var v6: Double = v2
    let v21: Double = v9 / v8
    v9 = v6
    return v21
  }
  @inline(never)
  func f0(_ v0: [s1], _ v1: Double) -> Double {
    let v3: Double = v1 / v1
    var v4: Double = v1
    let v2: Double = v1 + v4
    let v13: Double = f65(v2)
    var v86: Double = v2
    let v108: [Double] = [v13, v86, v3, v3, v3, v4, v2]
    let v134: Double = v108[1]
    return v134
  }
  func benchmark() {
    let v0: [s1] = [s1(p0: [s0(p0: [[0.0]], p1: [[1.0], [2.0]]), s0(p0: [[3.0]], p1: [[4.0], [5.0]])], p1: [s0(p0: [[6.0]], p1: [[7.0], [8.0]]), s0(p0: [[9.0]], p1: [[10.0], [11.0]])])]
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
