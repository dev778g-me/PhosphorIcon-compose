package icons.duotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.PhIcons

val PhIcons.Duotone.DatabaseDuotone: ImageVector
    get() {
        if (_DatabaseDuotone != null) {
            return _DatabaseDuotone!!
        }
        _DatabaseDuotone = ImageVector.Builder(
            name = "Duotone.DatabaseDuotone",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(
                fill = SolidColor(Color.Black),
                fillAlpha = 0.2f,
                strokeAlpha = 0.2f
            ) {
                moveTo(40f, 80f)
                arcToRelative(88f, 48f, 0f, isMoreThanHalf = true, isPositiveArc = false, 176f, 0f)
                arcToRelative(88f, 48f, 0f, isMoreThanHalf = true, isPositiveArc = false, -176f, 0f)
                close()
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(40f, 80f)
                arcToRelative(88f, 48f, 0f, isMoreThanHalf = true, isPositiveArc = false, 176f, 0f)
                arcToRelative(88f, 48f, 0f, isMoreThanHalf = true, isPositiveArc = false, -176f, 0f)
                close()
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(40f, 80f)
                verticalLineToRelative(48f)
                curveToRelative(0f, 26.51f, 39.4f, 48f, 88f, 48f)
                reflectiveCurveToRelative(88f, -21.49f, 88f, -48f)
                verticalLineTo(80f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(40f, 128f)
                verticalLineToRelative(48f)
                curveToRelative(0f, 26.51f, 39.4f, 48f, 88f, 48f)
                reflectiveCurveToRelative(88f, -21.49f, 88f, -48f)
                verticalLineTo(128f)
            }
        }.build()

        return _DatabaseDuotone!!
    }

@Suppress("ObjectPropertyName")
private var _DatabaseDuotone: ImageVector? = null
