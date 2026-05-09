package com.phosphor.icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Filled.MedalMilitaryFill: ImageVector
    get() {
        if (_MedalMilitaryFill != null) {
            return _MedalMilitaryFill!!
        }
        _MedalMilitaryFill = ImageVector.Builder(
            name = "Filled.MedalMilitaryFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(207f, 40f)
                lineTo(49f, 40f)
                arcTo(17f, 17f, 0f, isMoreThanHalf = false, isPositiveArc = false, 32f, 57f)
                verticalLineToRelative(49.21f)
                arcToRelative(17f, 17f, 0f, isMoreThanHalf = false, isPositiveArc = false, 10f, 15.47f)
                lineToRelative(62.6f, 28.45f)
                arcToRelative(48f, 48f, 0f, isMoreThanHalf = true, isPositiveArc = false, 46.88f, 0f)
                lineTo(214f, 121.68f)
                arcToRelative(17f, 17f, 0f, isMoreThanHalf = false, isPositiveArc = false, 10f, -15.47f)
                lineTo(224f, 57f)
                arcTo(17f, 17f, 0f, isMoreThanHalf = false, isPositiveArc = false, 207f, 40f)
                close()
                moveTo(96f, 56f)
                horizontalLineToRelative(64f)
                verticalLineToRelative(72.67f)
                lineToRelative(-32f, 14.54f)
                lineTo(96f, 128.67f)
                close()
                moveTo(128f, 224f)
                arcToRelative(32f, 32f, 0f, isMoreThanHalf = true, isPositiveArc = true, 32f, -32f)
                arcTo(32f, 32f, 0f, isMoreThanHalf = false, isPositiveArc = true, 128f, 224f)
                close()
            }
        }.build()

        return _MedalMilitaryFill!!
    }

@Suppress("ObjectPropertyName")
private var _MedalMilitaryFill: ImageVector? = null
