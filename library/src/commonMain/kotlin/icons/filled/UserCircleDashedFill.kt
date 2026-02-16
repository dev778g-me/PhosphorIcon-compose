package icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.PhIcons

val PhIcons.Filled.UserCircleDashedFill: ImageVector
    get() {
        if (_UserCircleDashedFill != null) {
            return _UserCircleDashedFill!!
        }
        _UserCircleDashedFill = ImageVector.Builder(
            name = "Filled.UserCircleDashedFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(96.26f, 37f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 102f, 27.29f)
                arcToRelative(104.11f, 104.11f, 0f, isMoreThanHalf = false, isPositiveArc = true, 52f, 0f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2f, 15.75f)
                arcToRelative(8.15f, 8.15f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2f, -0.26f)
                arcToRelative(88f, 88f, 0f, isMoreThanHalf = false, isPositiveArc = false, -44f, 0f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 96.26f, 37f)
                close()
                moveTo(33.35f, 110f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 9.85f, -5.57f)
                arcToRelative(88f, 88f, 0f, isMoreThanHalf = false, isPositiveArc = true, 22f, -38.09f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 53.79f, 55.14f)
                arcToRelative(104.05f, 104.05f, 0f, isMoreThanHalf = false, isPositiveArc = false, -26f, 45f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 33.35f, 110f)
                close()
                moveTo(212.79f, 104.44f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 15.42f, -4.28f)
                arcToRelative(104f, 104f, 0f, isMoreThanHalf = false, isPositiveArc = false, -26f, -45f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = true, isPositiveArc = false, -11.41f, 11.22f)
                arcTo(88f, 88f, 0f, isMoreThanHalf = false, isPositiveArc = true, 212.79f, 104.45f)
                close()
                moveTo(222.66f, 146f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, -9.85f, 5.58f)
                arcToRelative(87.61f, 87.61f, 0f, isMoreThanHalf = false, isPositiveArc = true, -19f, 34.83f)
                arcTo(79.75f, 79.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, 172f, 165.11f)
                arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, -4.83f, 0.31f)
                arcToRelative(59.81f, 59.81f, 0f, isMoreThanHalf = false, isPositiveArc = true, -78.27f, 0f)
                arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, -4.84f, -0.31f)
                arcToRelative(79.52f, 79.52f, 0f, isMoreThanHalf = false, isPositiveArc = false, -22f, 21.12f)
                arcToRelative(87.7f, 87.7f, 0f, isMoreThanHalf = false, isPositiveArc = true, -18.83f, -34.67f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, -15.42f, 4.28f)
                arcToRelative(104.07f, 104.07f, 0f, isMoreThanHalf = false, isPositiveArc = false, 200.46f, 0f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 222.66f, 146f)
                close()
                moveTo(128f, 164f)
                arcToRelative(44f, 44f, 0f, isMoreThanHalf = true, isPositiveArc = false, -44f, -44f)
                arcTo(44.05f, 44.05f, 0f, isMoreThanHalf = false, isPositiveArc = false, 128f, 164f)
                close()
            }
        }.build()

        return _UserCircleDashedFill!!
    }

@Suppress("ObjectPropertyName")
private var _UserCircleDashedFill: ImageVector? = null
