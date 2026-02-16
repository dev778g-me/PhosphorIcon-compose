package icons.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.PhIcons

val PhIcons.Bold.ChatCircleSlashBold: ImageVector
    get() {
        if (_ChatCircleSlashBold != null) {
            return _ChatCircleSlashBold!!
        }
        _ChatCircleSlashBold = ImageVector.Builder(
            name = "Bold.ChatCircleSlashBold",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 24f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(48f, 40f)
                lineTo(208f, 216f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 24f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(63.42f, 57f)
                arcToRelative(96f, 96f, 0f, isMoreThanHalf = false, isPositiveArc = false, -18.53f, 119.1f)
                horizontalLineToRelative(0f)
                lineTo(32.42f, 213.46f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 10.12f, 10.12f)
                lineToRelative(37.39f, -12.47f)
                horizontalLineToRelative(0f)
                arcTo(96f, 96f, 0f, isMoreThanHalf = false, isPositiveArc = false, 192.58f, 199f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 24f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(216.32f, 165.69f)
                arcTo(96.07f, 96.07f, 0f, isMoreThanHalf = false, isPositiveArc = false, 98.87f, 36.5f)
            }
        }.build()

        return _ChatCircleSlashBold!!
    }

@Suppress("ObjectPropertyName")
private var _ChatCircleSlashBold: ImageVector? = null
