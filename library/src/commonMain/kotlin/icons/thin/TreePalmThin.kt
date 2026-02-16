package icons.thin

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.PhIcons

val PhIcons.Thin.TreePalmThin: ImageVector
    get() {
        if (_TreePalmThin != null) {
            return _TreePalmThin!!
        }
        _TreePalmThin = ImageVector.Builder(
            name = "Thin.TreePalmThin",
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
                moveTo(128f, 104f)
                arcToRelative(65.47f, 65.47f, 0f, isMoreThanHalf = false, isPositiveArc = true, 17.84f, -45.25f)
                arcToRelative(58.87f, 58.87f, 0f, isMoreThanHalf = false, isPositiveArc = true, 86.16f, 0f)
                close()
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 8f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(128f, 104.52f)
                arcToRelative(64.26f, 64.26f, 0f, isMoreThanHalf = false, isPositiveArc = true, 87.42f, 23.26f)
                arcTo(63f, 63f, 0f, isMoreThanHalf = false, isPositiveArc = true, 221.81f, 176f)
                close()
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 8f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(128f, 104f)
                arcToRelative(65.47f, 65.47f, 0f, isMoreThanHalf = false, isPositiveArc = false, -17.84f, -45.25f)
                arcToRelative(58.87f, 58.87f, 0f, isMoreThanHalf = false, isPositiveArc = false, -86.16f, 0f)
                close()
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 8f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(128f, 104.52f)
                arcToRelative(64.26f, 64.26f, 0f, isMoreThanHalf = false, isPositiveArc = false, -87.42f, 23.26f)
                arcTo(63f, 63f, 0f, isMoreThanHalf = false, isPositiveArc = false, 34.19f, 176f)
                close()
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 8f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(128f, 104.52f)
                lineTo(128f, 224f)
            }
        }.build()

        return _TreePalmThin!!
    }

@Suppress("ObjectPropertyName")
private var _TreePalmThin: ImageVector? = null
