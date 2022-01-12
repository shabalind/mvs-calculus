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
    var p0: [s0]
    var p1: s1
  }
  struct s3 {
    var p0: [s1]
    var p1: s2
  }
  @inline(never)
  func f0(_ v0: s3, _ v1: [s1], _ v2: Double) -> Double {
    let v4: [s1] = v0.p0
    let v15: s1 = v4[1]
    let v6: s0 = v15.p0
    let v12: [[Double]] = v6.p1
    let v36: [Double] = v12[0]
    let v80: Double = v36[0]
    let v34: Double = v80 + v2
    var v74: Double = v34
    let v100: Double = v80 * v34
    let v90: Double = v74 * v100
    let v105: [Double] = [v90, v90]
    let v174: Double = v105[1]
    return v174
  }
  func benchmark() {
    let v0: s3 = s3(p0: [s1(p0: s0(p0: [[0.0]], p1: [[1.0], [2.0]]), p1: s0(p0: [[3.0]], p1: [[4.0], [5.0]])), s1(p0: s0(p0: [[6.0]], p1: [[7.0], [8.0]]), p1: s0(p0: [[9.0]], p1: [[10.0], [11.0]]))], p1: s2(p0: [s0(p0: [[12.0]], p1: [[13.0], [14.0]])], p1: s1(p0: s0(p0: [[15.0]], p1: [[16.0], [17.0]]), p1: s0(p0: [[18.0]], p1: [[19.0], [20.0]]))))
    let v1: [s1] = [s1(p0: s0(p0: [[21.0]], p1: [[22.0], [23.0]]), p1: s0(p0: [[24.0]], p1: [[25.0], [26.0]])), s1(p0: s0(p0: [[27.0]], p1: [[28.0], [29.0]]), p1: s0(p0: [[30.0]], p1: [[31.0], [32.0]]))]
    let v2: Double = 33.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 33.0
    for _ in 1...1000 {
      result = f0(v0, v1, v2)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
