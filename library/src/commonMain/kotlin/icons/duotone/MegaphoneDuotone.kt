package icons.duotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.PhIcons

val PhIcons.Duotone.MegaphoneDuotone: ImageVector
    get() {
        if (_MegaphoneDuotone != null) {
            return _MegaphoneDuotone!!
        }
        _MegaphoneDuotone = ImageVector.Builder(
            name = "Duotone.MegaphoneDuotone",
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
                moveTo(160f, 160f)
                horizontalLineToRelative(40f)
                arcToRelative(40f, 40f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -80f)
                horizontalLineTo(160f)
                close()
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(160f, 80f)
                verticalLineTo(200.67f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3.56f, 6.65f)
                lineToRelative(11f, 7.33f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12.2f, -4.72f)
                lineTo(200f, 160f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(40f, 200f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 13.15f, 6.12f)
                curveTo(105.55f, 162.16f, 160f, 160f, 160f, 160f)
                horizontalLineToRelative(40f)
                arcToRelative(40f, 40f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -80f)
                horizontalLineTo(160f)
                reflectiveCurveTo(105.55f, 77.84f, 53.15f, 33.89f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 40f, 40f)
                close()
            }
        }.build()

        return _MegaphoneDuotone!!
    }

@Suppress("ObjectPropertyName")
private var _MegaphoneDuotone: ImageVector? = null
