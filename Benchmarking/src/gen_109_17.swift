  import Dispatch
  struct s0 {
    var p0: [[Double]]
    var p1: [[Double]]
  }
  struct s1 {
    var p0: [[s0]]
    var p1: [s0]
  }
  struct s3 {
    var p0: s0
    var p1: s1
  }
  @inline(never)
  func f0(_ v0: s3, _ v1: [s0], _ v2: Double) -> Double {
    let v6: s0 = v1[0]
    let v3: [[Double]] = v6.p0
    var v10: [[Double]] = v3
    let v16: [Double] = v10[0]
    v10[1] = v16
    var v31: [Double] = v16
    let v39: Double = v31[0]
    var v27: [Double] = v16
    v27[0] = v2
    let v50: Double = v27[0]
    v27[0] = v50
    let v188: Double = v39 + v50
    return v188
  }
  func benchmark() {
    let v0: s3 = s3(p0: s0(p0: [[0.0], [1.0]], p1: [[2.0], [3.0], [4.0]]), p1: s1(p0: [[s0(p0: [[5.0], [6.0]], p1: [[7.0], [8.0], [9.0]])], [s0(p0: [[10.0], [11.0]], p1: [[12.0], [13.0], [14.0]])]], p1: [s0(p0: [[15.0], [16.0]], p1: [[17.0], [18.0], [19.0]])]))
    let v1: [s0] = [s0(p0: [[20.0], [21.0]], p1: [[22.0], [23.0], [24.0]])]
    let v2: Double = 25.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 25.0
    for _ in 1...1000 {
      result = f0(v0, v1, v2)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
