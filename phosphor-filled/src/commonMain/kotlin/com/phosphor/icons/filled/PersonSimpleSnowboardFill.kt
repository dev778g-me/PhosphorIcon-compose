package com.phosphor.icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Filled.PersonSimpleSnowboardFill: ImageVector
    get() {
        if (_PersonSimpleSnowboardFill != null) {
            return _PersonSimpleSnowboardFill!!
        }
        _PersonSimpleSnowboardFill = ImageVector.Builder(
            name = "Filled.PersonSimpleSnowboardFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(136f, 52f)
                arcToRelative(28f, 28f, 0f, isMoreThanHalf = true, isPositiveArc = true, 28f, 28f)
                arcTo(28f, 28f, 0f, isMoreThanHalf = false, isPositiveArc = true, 136f, 52f)
                close()
                moveTo(223.67f, 122.25f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -9.93f, 5.42f)
                lineToRelative(-79.07f, -23.26f)
                lineToRelative(-7.78f, 11.67f)
                lineToRelative(35.33f, 10.23f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 4.42f, 12.14f)
                lineToRelative(-19.75f, 29.44f)
                lineToRelative(50.89f, 14.75f)
                arcTo(25.32f, 25.32f, 0f, isMoreThanHalf = false, isPositiveArc = true, 216f, 206.81f)
                arcTo(25.28f, 25.28f, 0f, isMoreThanHalf = false, isPositiveArc = true, 190.79f, 232f)
                arcToRelative(25.88f, 25.88f, 0f, isMoreThanHalf = false, isPositiveArc = true, -7.14f, -1f)
                lineTo(26.21f, 185.35f)
                arcTo(25.32f, 25.32f, 0f, isMoreThanHalf = false, isPositiveArc = true, 8f, 161.18f)
                arcTo(25.25f, 25.25f, 0f, isMoreThanHalf = false, isPositiveArc = true, 40.34f, 137f)
                lineToRelative(44.73f, 13f)
                lineToRelative(33.52f, -50.28f)
                lineToRelative(-40.85f, -12f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = true, isPositiveArc = true, 4.52f, -15.35f)
                lineToRelative(136f, 40f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 223.67f, 122.25f)
                close()
                moveTo(117.58f, 130f)
                lineToRelative(-16.4f, 24.6f)
                lineToRelative(29.58f, 8.58f)
                lineToRelative(16.49f, -24.59f)
                close()
            }
        }.build()

        return _PersonSimpleSnowboardFill!!
    }

@Suppress("ObjectPropertyName")
private var _PersonSimpleSnowboardFill: ImageVector? = null
