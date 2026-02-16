package icons.thin

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.PhIcons

val PhIcons.Thin.HorseThin: ImageVector
    get() {
        if (_HorseThin != null) {
            return _HorseThin!!
        }
        _HorseThin = ImageVector.Builder(
            name = "Thin.HorseThin",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 8f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(176f, 120f)
                arcToRelative(48f, 48f, 0f, isMoreThanHalf = false, isPositiveArc = true, -48f, 48f)
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(124f, 100f)
                moveToRelative(-8f, 0f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = true, isPositiveArc = true, 16f, 0f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = true, isPositiveArc = true, -16f, 0f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 8f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(64f, 200f)
                curveToRelative(17.43f, 15.6f, 40.59f, 24.48f, 65.94f, 24f)
                curveToRelative(51.48f, -1f, 93.33f, -43.13f, 94.05f, -94.61f)
                arcTo(96f, 96f, 0f, isMoreThanHalf = false, isPositiveArc = false, 128f, 32f)
                horizontalLineToRelative(-8f)
                verticalLineTo(64f)
                lineTo(16f, 128f)
                lineToRelative(13.79f, 22f)
                arcToRelative(24f, 24f, 0f, isMoreThanHalf = false, isPositiveArc = false, 23.51f, 9.62f)
                curveToRelative(17.47f, -3f, 48.06f, -7.64f, 74.7f, 8.34f)
                horizontalLineToRelative(0f)
                lineTo(92.13f, 217.32f)
            }
        }.build()

        return _HorseThin!!
    }

@Suppress("ObjectPropertyName")
private var _HorseThin: ImageVector? = null
