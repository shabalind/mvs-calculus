  import Dispatch
  struct s0 {
    var p0: [[Double]]
    var p1: [[Double]]
  }
  struct s1 {
    var p0: [[Double]]
  }
  struct s6 {
    var p0: [[s0]]
    var p1: s1
  }
  @inline(never)
  func f0(_ v0: [[s6]], _ v1: Double) -> Double {
    let v7: [s6] = v0[1]
    var v3: Double = v1
    let v2: s6 = v7[0]
    let v5: s1 = v2.p1
    let v10: s1 = v2.p1
    var v39: Double = v3
    let v45: [[Double]] = v10.p0
    let v59: [[Double]] = v5.p0
    var v38: [[Double]] = v59
    v38 = v45
    var v63: Double = v1
    let v79: [Double] = v38[0]
    var v87: [Double] = v79
    let v123: Double = v87[0]
    v38[0] = v79
    v87[0] = v63
    v63 = v39
    return v123
  }
  func benchmark() {
    let v0: [[s6]] = [[s6(p0: [[s0(p0: [[0.0]], p1: [[1.0], [2.0]])], [s0(p0: [[3.0]], p1: [[4.0], [5.0]])], [s0(p0: [[6.0]], p1: [[7.0], [8.0]])]], p1: s1(p0: [[9.0]]))], [s6(p0: [[s0(p0: [[10.0]], p1: [[11.0], [12.0]])], [s0(p0: [[13.0]], p1: [[14.0], [15.0]])], [s0(p0: [[16.0]], p1: [[17.0], [18.0]])]], p1: s1(p0: [[19.0]]))]]
    let v1: Double = 20.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 20.0
    for _ in 1...1000 {
      result = f0(v0, v1)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
