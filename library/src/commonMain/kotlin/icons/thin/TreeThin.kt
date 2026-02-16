package icons.thin

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.PhIcons

val PhIcons.Thin.TreeThin: ImageVector
    get() {
        if (_TreeThin != null) {
            return _TreeThin!!
        }
        _TreeThin = ImageVector.Builder(
            name = "Thin.TreeThin",
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
                moveTo(128f, 232f)
                lineTo(128f, 88f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 8f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(128f, 152f)
                lineTo(80f, 128f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 8f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(128f, 128f)
                lineTo(176f, 104f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 8f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(128f, 177.94f)
                arcToRelative(63.72f, 63.72f, 0f, isMoreThanHalf = false, isPositiveArc = false, 41.66f, 14f)
                curveToRelative(33.93f, -0.86f, 62.43f, -30.22f, 62.34f, -64.16f)
                arcToRelative(64f, 64f, 0f, isMoreThanHalf = false, isPositiveArc = false, -40.13f, -59.2f)
                arcToRelative(68f, 68f, 0f, isMoreThanHalf = false, isPositiveArc = false, -127.74f, 0f)
                arcTo(64f, 64f, 0f, isMoreThanHalf = false, isPositiveArc = false, 24f, 127.82f)
                curveToRelative(-0.09f, 33.94f, 28.42f, 63.3f, 62.35f, 64.16f)
                arcTo(63.71f, 63.71f, 0f, isMoreThanHalf = false, isPositiveArc = false, 128f, 177.94f)
                close()
            }
        }.build()

        return _TreeThin!!
    }

@Suppress("ObjectPropertyName")
private var _TreeThin: ImageVector? = null
