  import Dispatch
  struct s0 {
    var p0: [[Double]]
    var p1: [[Double]]
  }
  struct s1 {
    var p0: [[s0]]
    var p1: [[s0]]
  }
  @inline(never)
  func f0(_ v0: [[s1]], _ v1: Double) -> Double {
    let v2: [s1] = v0[0]
    let v4: s1 = v2[0]
    let v7: [[s0]] = v4.p0
    let v17: Double = v1 + v1
    let v13: [s0] = v7[0]
    let v19: Double = v1 / v17
    let v30: s0 = v13[0]
    let v18: [[Double]] = v30.p1
    let v66: [Double] = v18[1]
    let v24: Double = v66[0]
    let v73: [Double] = [v17, v24, v24, v19, v1]
    let v163: Double = v73[2]
    return v163
  }
  func benchmark() {
    let v0: [[s1]] = [[s1(p0: [[s0(p0: [[0.0]], p1: [[1.0], [2.0]])], [s0(p0: [[3.0]], p1: [[4.0], [5.0]])]], p1: [[s0(p0: [[6.0]], p1: [[7.0], [8.0]])], [s0(p0: [[9.0]], p1: [[10.0], [11.0]])]])]]
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
