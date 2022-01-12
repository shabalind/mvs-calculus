  import Dispatch
  struct s0 {
    var p0: [[Double]]
    var p1: [[Double]]
  }
  struct s1 {
    var p0: [s0]
    var p1: [s0]
  }
  struct s2 {
    var p0: [s1]
    var p1: [s0]
  }
  struct s3 {
    var p0: s2
    var p1: [s0]
  }
  @inline(never)
  func f0(_ v0: s3, _ v1: Double) -> Double {
    var v7: Double = v1
    let v8: [s0] = v0.p1
    let v3: s0 = v8[1]
    let v20: [[Double]] = v3.p0
    let v16: [Double] = v20[0]
    var v57: [Double] = v16
    let v39: Double = v57[0]
    var v79: Double = v39
    v57[0] = v7
    let v100: Double = v79 * v1
    return v100
  }
  func benchmark() {
    let v0: s3 = s3(p0: s2(p0: [s1(p0: [s0(p0: [[0.0], [1.0], [2.0]], p1: [[3.0]])], p1: [s0(p0: [[4.0], [5.0], [6.0]], p1: [[7.0]]), s0(p0: [[8.0], [9.0], [10.0]], p1: [[11.0]])])], p1: [s0(p0: [[12.0], [13.0], [14.0]], p1: [[15.0]])]), p1: [s0(p0: [[16.0], [17.0], [18.0]], p1: [[19.0]]), s0(p0: [[20.0], [21.0], [22.0]], p1: [[23.0]]), s0(p0: [[24.0], [25.0], [26.0]], p1: [[27.0]])])
    let v1: Double = 28.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 28.0
    for _ in 1...1000 {
      result = f0(v0, v1)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
