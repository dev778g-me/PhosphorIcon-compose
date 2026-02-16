package icons.duotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.PhIcons

val PhIcons.Duotone.SpadeDuotone: ImageVector
    get() {
        if (_SpadeDuotone != null) {
            return _SpadeDuotone!!
        }
        _SpadeDuotone = ImageVector.Builder(
            name = "Duotone.SpadeDuotone",
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
                moveTo(128f, 24f)
                reflectiveCurveTo(32f, 72f, 32f, 136f)
                arcToRelative(48f, 48f, 0f, isMoreThanHalf = false, isPositiveArc = false, 79.55f, 36.18f)
                lineTo(96f, 224f)
                horizontalLineToRelative(64f)
                lineToRelative(-15.55f, -51.82f)
                arcTo(48f, 48f, 0f, isMoreThanHalf = false, isPositiveArc = false, 224f, 136f)
                curveTo(224f, 72f, 128f, 24f, 128f, 24f)
                close()
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(128f, 24f)
                reflectiveCurveTo(32f, 72f, 32f, 136f)
                arcToRelative(48f, 48f, 0f, isMoreThanHalf = false, isPositiveArc = false, 79.55f, 36.18f)
                lineTo(96f, 224f)
                horizontalLineToRelative(64f)
                lineToRelative(-15.55f, -51.82f)
                arcTo(48f, 48f, 0f, isMoreThanHalf = false, isPositiveArc = false, 224f, 136f)
                curveTo(224f, 72f, 128f, 24f, 128f, 24f)
                close()
            }
        }.build()

        return _SpadeDuotone!!
    }

@Suppress("ObjectPropertyName")
private var _SpadeDuotone: ImageVector? = null
