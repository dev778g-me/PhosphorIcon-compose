package icons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.PhIcons

val PhIcons.Regular.Atom: ImageVector
    get() {
        if (_Atom != null) {
            return _Atom!!
        }
        _Atom = ImageVector.Builder(
            name = "Regular.Atom",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(96.79f, 159.2f)
                arcToRelative(116.33f, 44.13f, 45f, isMoreThanHalf = true, isPositiveArc = false, 62.41f, -62.41f)
                arcToRelative(116.33f, 44.13f, 45f, isMoreThanHalf = true, isPositiveArc = false, -62.41f, 62.41f)
                close()
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(45.74f, 210.26f)
                arcToRelative(116.33f, 44.13f, 135f, isMoreThanHalf = true, isPositiveArc = false, 164.52f, -164.52f)
                arcToRelative(116.33f, 44.13f, 135f, isMoreThanHalf = true, isPositiveArc = false, -164.52f, 164.52f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(128f, 128f)
                moveToRelative(-12f, 0f)
                arcToRelative(12f, 12f, 0f, isMoreThanHalf = true, isPositiveArc = true, 24f, 0f)
                arcToRelative(12f, 12f, 0f, isMoreThanHalf = true, isPositiveArc = true, -24f, 0f)
            }
        }.build()

        return _Atom!!
    }

@Suppress("ObjectPropertyName")
private var _Atom: ImageVector? = null
