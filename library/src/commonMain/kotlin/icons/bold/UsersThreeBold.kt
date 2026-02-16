package icons.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.PhIcons

val PhIcons.Bold.UsersThreeBold: ImageVector
    get() {
        if (_UsersThreeBold != null) {
            return _UsersThreeBold!!
        }
        _UsersThreeBold = ImageVector.Builder(
            name = "Bold.UsersThreeBold",
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
                moveTo(128f, 144f)
                moveToRelative(-40f, 0f)
                arcToRelative(40f, 40f, 0f, isMoreThanHalf = true, isPositiveArc = true, 80f, 0f)
                arcToRelative(40f, 40f, 0f, isMoreThanHalf = true, isPositiveArc = true, -80f, 0f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 24f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(72f, 216f)
                arcToRelative(65f, 65f, 0f, isMoreThanHalf = false, isPositiveArc = true, 112f, 0f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 24f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(164f, 72.55f)
                arcToRelative(32f, 32f, 0f, isMoreThanHalf = true, isPositiveArc = true, 39.63f, 45.28f)
                curveToRelative(14.33f, 3.1f, 27.89f, 14.84f, 36.4f, 26.17f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 24f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(16f, 144f)
                curveToRelative(8.51f, -11.33f, 22.06f, -23.07f, 36.4f, -26.17f)
                arcTo(32f, 32f, 0f, isMoreThanHalf = true, isPositiveArc = true, 92f, 72.55f)
            }
        }.build()

        return _UsersThreeBold!!
    }

@Suppress("ObjectPropertyName")
private var _UsersThreeBold: ImageVector? = null
